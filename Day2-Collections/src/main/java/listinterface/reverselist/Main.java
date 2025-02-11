package listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));

        ListReverser reverser = new ListReverser();

        System.out.println("Original ArrayList: " + arrayList);
        reverser.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        System.out.println("Original LinkedList: " + linkedList);
        reverser.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
