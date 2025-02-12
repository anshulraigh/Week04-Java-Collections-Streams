package mapinterface.groupbyproperty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance")
        );

        Map<String, List<Employee>> groupedEmployees = GroupByDepartment.groupByDepartment(employees);

        System.out.println("Employees grouped by department: " + groupedEmployees);
        // Expected Output: {HR=[Alice, Carol], IT=[Bob], Finance=[David]}
    }
}
