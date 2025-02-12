package setinterface.subsetcheck;

import java.util.Set;

public class SubsetChecker {

    public boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}
