package serialization;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeSerializerTest {
    @Test
    public void testSerializeEmployeesCreatesFile() throws IOException {
        String testFilePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_employees.ser";
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(201, "David", "IT", 75000));

        EmployeeSerializer.serializeEmployees(testFilePath, employees);

        File testFile = new File(testFilePath);
        assertTrue(testFile.exists(), "Serialized file should be created.");
    }
}
