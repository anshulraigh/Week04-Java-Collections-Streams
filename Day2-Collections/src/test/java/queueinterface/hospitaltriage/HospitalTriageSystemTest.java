package queueinterface.hospitaltriage;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageSystemTest {

    @Test
    void testProcessPatients() {
        HospitalTriageSystem triageSystem = new HospitalTriageSystem();
        triageSystem.addPatient("John", 3);
        triageSystem.addPatient("Alice", 5);
        triageSystem.addPatient("Bob", 2);

        List<String> expectedOrder = List.of("Alice", "John", "Bob");

        assertEquals(expectedOrder, new LinkedList<>(triageSystem.processPatients()));
    }

    @Test
    void testEmptyQueue() {
        HospitalTriageSystem triageSystem = new HospitalTriageSystem();
        assertTrue(triageSystem.processPatients().isEmpty());
    }

    @Test
    void testSameSeverityPatients() {
        HospitalTriageSystem triageSystem = new HospitalTriageSystem();
        triageSystem.addPatient("Eve", 4);
        triageSystem.addPatient("Mike", 4);

        List<String> expectedOrder = List.of("Eve", "Mike"); // Order may vary for equal severity

        assertEquals(expectedOrder, new LinkedList<>(triageSystem.processPatients()));
    }
}
