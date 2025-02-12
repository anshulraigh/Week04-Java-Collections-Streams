package setinterface.sortedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(9);
        numberSet.add(1);

        SetToSortedList converter = new SetToSortedList();
        List<Integer> sortedList = converter.convertToSortedList(numberSet);

        System.out.println("Sorted List: " + sortedList);
    }
}
