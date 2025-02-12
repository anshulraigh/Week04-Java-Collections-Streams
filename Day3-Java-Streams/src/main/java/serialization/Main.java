package serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\employees.ser";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "IT", 70000));
        employees.add(new Employee(102, "Bob", "HR", 60000));
        employees.add(new Employee(103, "Charlie", "Finance", 80000));

        try {
            EmployeeSerializer.serializeEmployees(FILE_PATH, employees);
            System.out.println("Employees serialized successfully!");

            List<Employee> deserializedEmployees = EmployeeDeserializer.deserializeEmployees(FILE_PATH);
            System.out.println("Deserialized Employees:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
