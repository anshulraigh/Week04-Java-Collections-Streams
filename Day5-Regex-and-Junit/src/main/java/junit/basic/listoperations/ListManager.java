package junit.basic.listoperations;

import java.util.List;

public class ListManager {

    /**
     * Adds an element to the given list.
     * @param list the list to add the element to
     * @param element the element to add
     */
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    /**
     * Removes the first occurrence of the given element from the list.
     * @param list the list from which to remove the element
     * @param element the element to remove
     */
    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    /**
     * Returns the size of the list.
     * @param list the list to check
     * @return the size of the list
     */
    public static int getSize(List<Integer> list) {
        return list.size();
    }
}
