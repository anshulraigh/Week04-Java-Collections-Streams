package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        SetOperations operations = new SetOperations();
        Set<Integer> symmetricDifference = operations.getSymmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}
