package junit.basic.listoperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(1, ListManager.getSize(list));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        ListManager.removeElement(list, 20);
        assertFalse(list.contains(20));
        assertEquals(1, ListManager.getSize(list));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));

        ListManager.addElement(list, 1);
        ListManager.addElement(list, 2);
        ListManager.addElement(list, 3);
        assertEquals(3, ListManager.getSize(list));

        ListManager.removeElement(list, 2);
        assertEquals(2, ListManager.getSize(list));
    }
}
