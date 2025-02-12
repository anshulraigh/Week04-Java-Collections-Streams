package listinterface.nthfromend;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class NthElementFinderTest {

    @Test
    void testFindNthFromEnd_ValidInput() {
        NthElementFinder finder = new NthElementFinder();
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", finder.findNthFromEnd(list, 2));
    }

    @Test
    void testFindNthFromEnd_FirstElement() {
        NthElementFinder finder = new NthElementFinder();
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("A", finder.findNthFromEnd(list, 3));
    }

    @Test
    void testFindNthFromEnd_InvalidN() {
        NthElementFinder finder = new NthElementFinder();
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertThrows(NoSuchElementException.class, () -> finder.findNthFromEnd(list, 5));
    }

    @Test
    void testFindNthFromEnd_EmptyList() {
        NthElementFinder finder = new NthElementFinder();
        LinkedList<String> list = new LinkedList<>();

        assertThrows(NoSuchElementException.class, () -> finder.findNthFromEnd(list, 1));
    }
}

