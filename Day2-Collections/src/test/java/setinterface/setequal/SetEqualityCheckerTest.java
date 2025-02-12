package setinterface.setequal;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetEqualityCheckerTest {

    @Test
    void testAreSetsEqual_TrueCase() {
        SetEqualityChecker checker = new SetEqualityChecker();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(checker.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsEqual_FalseCase() {
        SetEqualityChecker checker = new SetEqualityChecker();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);

        assertFalse(checker.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsEqual_EmptySets() {
        SetEqualityChecker checker = new SetEqualityChecker();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(checker.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsEqual_NullSets() {
        SetEqualityChecker checker = new SetEqualityChecker();

        assertThrows(IllegalArgumentException.class, () -> checker.areSetsEqual(null, new HashSet<>()));
    }
}
