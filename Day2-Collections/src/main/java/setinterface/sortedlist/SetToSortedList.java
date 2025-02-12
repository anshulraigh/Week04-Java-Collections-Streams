package setinterface.sortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SetToSortedList {

    public List<Integer> convertToSortedList(Set<Integer> numberSet) {
        List<Integer> sortedList = new ArrayList<>(numberSet);
        Collections.sort(sortedList);
        return sortedList;
    }
}
