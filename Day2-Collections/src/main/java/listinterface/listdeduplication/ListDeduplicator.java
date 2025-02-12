package listinterface.listdeduplication;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListDeduplicator {

    public List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}

