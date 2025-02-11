package listinterface.reverselist;

import java.util.List;

public class ListReverser {
    public void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}

