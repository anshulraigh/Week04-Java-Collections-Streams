package insurance_management;

import java.util.*;
import java.util.stream.Collectors;

class PolicyManager {
    private Map<String, Policy> policyHashMap = new HashMap<>();
    private Map<String, Policy> policyLinkedHashMap = new LinkedHashMap<>();
    private TreeMap<Date, Policy> policyTreeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyHashMap.put(policy.getPolicyNumber(), policy);
        policyLinkedHashMap.put(policy.getPolicyNumber(), policy);
        policyTreeMap.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyHashMap.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        Date now = new Date();
        long thirtyDays = 30L * 24 * 60 * 60 * 1000;
        return policyTreeMap.tailMap(now).values().stream()
                .filter(p -> p.getExpiryDate().getTime() - now.getTime() <= thirtyDays)
                .collect(Collectors.toList());
    }

    public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
        return policyHashMap.values().stream()
                .filter(p -> p.getPolicyholderName().equalsIgnoreCase(policyholderName))
                .collect(Collectors.toList());
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        policyTreeMap.headMap(now).clear();
        policyHashMap.values().removeIf(p -> p.getExpiryDate().before(now));
        policyLinkedHashMap.values().removeIf(p -> p.getExpiryDate().before(now));
    }
}
