package setinterface.setequal;

import java.util.Set;

public class SetEqualityChecker {

    public boolean areSetsEqual(Set<?> set1, Set<?> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Sets cannot be null");
        }
        return set1.equals(set2);
    }
}

