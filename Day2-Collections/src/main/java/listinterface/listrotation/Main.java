package listinterface.listrotation;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int rotateBy = 2;

        ListRotator listRotator = new ListRotator();
        List<Integer> rotatedList = listRotator.rotateList(list, rotateBy);

        System.out.println("Rotated List: " + rotatedList);
    }
}
