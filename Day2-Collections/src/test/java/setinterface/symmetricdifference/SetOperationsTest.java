package setinterface.symmetricdifference;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testGetSymmetricDifference() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedDifference = new HashSet<>();
        expectedDifference.add(1);
        expectedDifference.add(2);
        expectedDifference.add(4);
        expectedDifference.add(5);

        assertEquals(expectedDifference, operations.getSymmetricDifference(set1, set2));
    }

    @Test
    void testGetSymmetricDifference_EmptySets() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(operations.getSymmetricDifference(set1, set2).isEmpty());
    }

    @Test
    void testGetSymmetricDifference_NoCommonElements() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        Set<Integer> expectedDifference = new HashSet<>();
        expectedDifference.add(1);
        expectedDifference.add(2);
        expectedDifference.add(3);
        expectedDifference.add(4);

        assertEquals(expectedDifference, operations.getSymmetricDifference(set1, set2));
    }

    @Test
    void testGetSymmetricDifference_AllCommonElements() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        assertTrue(operations.getSymmetricDifference(set1, set2).isEmpty());
    }
}
