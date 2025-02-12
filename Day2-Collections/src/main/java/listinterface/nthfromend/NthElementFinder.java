package listinterface.nthfromend;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class NthElementFinder {

    public String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        var firstPointer = list.listIterator();
        var secondPointer = list.listIterator();

        // Move firstPointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!firstPointer.hasNext()) {
                throw new NoSuchElementException("N is larger than the list size");
            }
            firstPointer.next();
        }

        // Move both pointers one step at a time until firstPointer reaches the end
        while (firstPointer.hasNext()) {
            firstPointer.next();
            secondPointer.next();
        }

        return secondPointer.next();
    }
}
