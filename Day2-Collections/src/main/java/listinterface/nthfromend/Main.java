package listinterface.nthfromend;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        NthElementFinder finder = new NthElementFinder();
        String result = finder.findNthFromEnd(list, n);

        System.out.println("The " + n + "th element from the end is: " + result);
    }
}

