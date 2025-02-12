package insurance;

import java.util.*;
import java.util.stream.Collectors;

class PolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getPoliciesExpiringSoon() {
        Date now = new Date();
        long thirtyDays = 30L * 24 * 60 * 60 * 1000;
        return treeSetPolicies.stream()
                .filter(p -> p.getExpiryDate().getTime() - now.getTime() <= thirtyDays)
                .collect(Collectors.toSet());
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        return hashSetPolicies.stream()
                .filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getDuplicatePolicies() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Policy p : hashSetPolicies) {
            countMap.put(p.getPolicyNumber(), countMap.getOrDefault(p.getPolicyNumber(), 0) + 1);
        }
        return hashSetPolicies.stream()
                .filter(p -> countMap.get(p.getPolicyNumber()) > 1)
                .collect(Collectors.toSet());
    }
}
