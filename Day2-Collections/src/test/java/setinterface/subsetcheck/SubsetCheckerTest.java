package setinterface.subsetcheck;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SubsetCheckerTest {

    @Test
    void testIsSubset_TrueCase() {
        SubsetChecker checker = new SubsetChecker();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(checker.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_FalseCase() {
        SubsetChecker checker = new SubsetChecker();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertFalse(checker.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_EmptySet1() {
        SubsetChecker checker = new SubsetChecker();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(checker.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_EmptySet2() {
        SubsetChecker checker = new SubsetChecker();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> set2 = new HashSet<>();

        assertFalse(checker.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_BothEmptySets() {
        SubsetChecker checker = new SubsetChecker();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(checker.isSubset(set1, set2));
    }
}
