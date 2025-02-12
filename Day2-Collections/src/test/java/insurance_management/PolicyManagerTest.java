package insurance_management;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    @Test
    void testAddAndRetrievePolicy() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy policy = new Policy("P1001", "Alice", sdf.parse("2025-06-15"), "Health", 5000);

        manager.addPolicy(policy);
        assertNotNull(manager.getPolicyByNumber("P1001"));
    }

    @Test
    void testPoliciesExpiringSoon() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy policy = new Policy("P1002", "Bob", sdf.parse("2024-02-28"), "Auto", 3000);

        manager.addPolicy(policy);
        assertFalse(manager.getPoliciesExpiringSoon().isEmpty());
    }

    @Test
    void testRemoveExpiredPolicies() throws ParseException {
        PolicyManager manager = new PolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy policy = new Policy("P1003", "Charlie", sdf.parse("2024-02-15"), "Home", 7000);

        manager.addPolicy(policy);
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P1003"));
    }
}
