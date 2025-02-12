package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> common = new HashSet<>(set1);

        result.addAll(set2);
        common.retainAll(set2);
        result.removeAll(common);

        return result;
    }
}
