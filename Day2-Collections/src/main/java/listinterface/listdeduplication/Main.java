package listinterface.listdeduplication;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);

        ListDeduplicator listDeduplicator = new ListDeduplicator();
        List<Integer> deduplicatedList = listDeduplicator.removeDuplicates(list);

        System.out.println("Deduplicated List: " + deduplicatedList);
    }
}
