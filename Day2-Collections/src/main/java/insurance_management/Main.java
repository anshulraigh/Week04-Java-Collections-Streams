package insurance_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        manager.addPolicy(new Policy("P1001", "Alice", sdf.parse("2025-06-15"), "Health", 5000));
        manager.addPolicy(new Policy("P1002", "Bob", sdf.parse("2024-03-05"), "Auto", 3000));
        manager.addPolicy(new Policy("P1003", "Charlie", sdf.parse("2024-02-28"), "Home", 7000));

        System.out.println("Retrieve Policy P1002: " + manager.getPolicyByNumber("P1002"));
        System.out.println("Policies Expiring Soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + manager.getPoliciesByPolicyholder("Alice"));

        manager.removeExpiredPolicies();
        System.out.println("After Removing Expired Policies, All Policies: " + manager.getPoliciesExpiringSoon());
    }
}
