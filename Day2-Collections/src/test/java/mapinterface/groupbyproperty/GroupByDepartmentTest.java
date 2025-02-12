package mapinterface.groupbyproperty;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GroupByDepartmentTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expected = new HashMap<>();
        expected.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expected.put("IT", Collections.singletonList(new Employee("Bob", "IT")));

        assertEquals(expected, GroupByDepartment.groupByDepartment(employees));
    }

    @Test
    void testEmptyList() {
        assertTrue(GroupByDepartment.groupByDepartment(Collections.emptyList()).isEmpty());
    }

    @Test
    void testSingleEmployee() {
        List<Employee> employees = Collections.singletonList(new Employee("John", "Finance"));

        Map<String, List<Employee>> expected = new HashMap<>();
        expected.put("Finance", Collections.singletonList(new Employee("John", "Finance")));

        assertEquals(expected, GroupByDepartment.groupByDepartment(employees));
    }
}
