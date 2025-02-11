package listinterface.listrotation;

import java.util.ArrayList;
import java.util.List;

public class ListRotator {

    public List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        if (size == 0 || positions <= 0) return new ArrayList<>(list);

        positions %= size;

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(positions, size));
        rotatedList.addAll(list.subList(0, positions));

        return rotatedList;
    }
}
