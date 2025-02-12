package setinterface.sortedlist;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {

    @Test
    void testConvertToSortedList() {
        SetToSortedList converter = new SetToSortedList();
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);
        assertEquals(expectedList, converter.convertToSortedList(numberSet));
    }

    @Test
    void testConvertToSortedList_EmptySet() {
        SetToSortedList converter = new SetToSortedList();
        Set<Integer> numberSet = new HashSet<>();

        assertTrue(converter.convertToSortedList(numberSet).isEmpty());
    }

    @Test
    void testConvertToSortedList_SingleElement() {
        SetToSortedList converter = new SetToSortedList();
        Set<Integer> numberSet = new HashSet<>(Collections.singleton(7));

        List<Integer> expectedList = Collections.singletonList(7);
        assertEquals(expectedList, converter.convertToSortedList(numberSet));
    }

    @Test
    void testConvertToSortedList_AlreadySorted() {
        SetToSortedList converter = new SetToSortedList();
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expectedList, converter.convertToSortedList(numberSet));
    }

    @Test
    void testConvertToSortedList_UnsortedSet() {
        SetToSortedList converter = new SetToSortedList();
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(10, 4, 8, 2));

        List<Integer> expectedList = Arrays.asList(2, 4, 8, 10);
        assertEquals(expectedList, converter.convertToSortedList(numberSet));
    }
}
