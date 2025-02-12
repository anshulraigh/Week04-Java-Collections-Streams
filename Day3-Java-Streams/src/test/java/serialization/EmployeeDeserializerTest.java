package serialization;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeDeserializerTest {
    @Test
    public void testDeserializeEmployeesReturnsCorrectData() throws IOException, ClassNotFoundException {
        String testFilePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_employees.ser";

        List<Employee> employees = List.of(new Employee(301, "Eve", "Marketing", 68000));
        EmployeeSerializer.serializeEmployees(testFilePath, employees);

        List<Employee> deserializedEmployees = EmployeeDeserializer.deserializeEmployees(testFilePath);

        assertNotNull(deserializedEmployees, "Deserialized list should not be null.");
        assertEquals(1, deserializedEmployees.size(), "Should contain exactly one employee.");
        assertEquals("Eve", deserializedEmployees.get(0).toString().split(", ")[1].split("=")[1].replace("'", ""),
                "Deserialized employee name should match.");
    }
}
