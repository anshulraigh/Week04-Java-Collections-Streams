package mapinterface.groupbyproperty;

import java.util.*;

class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee employee : employees) {
            grouped.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return grouped;
    }
}
