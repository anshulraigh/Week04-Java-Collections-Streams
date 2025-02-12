package setinterface.unionintersection;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {

    @Test
    void testGetUnion() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        assertEquals(expectedUnion, operations.getUnion(set1, set2));
    }

    @Test
    void testGetIntersection() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        assertEquals(expectedIntersection, operations.getIntersection(set1, set2));
    }

    @Test
    void testGetUnion_EmptySets() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        assertTrue(operations.getUnion(set1, set2).isEmpty());
    }

    @Test
    void testGetIntersection_NoCommonElements() {
        SetOperations operations = new SetOperations();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        assertTrue(operations.getIntersection(set1, set2).isEmpty());
    }
}
