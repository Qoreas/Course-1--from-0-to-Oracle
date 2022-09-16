package HomeWork.Lessons_20_per_29.L20;

import java.util.ArrayList;
import java.util.Collections;

public class EX2 {
    static void sortList(String ... strings) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println("Adding strings to list");

        for (String s : strings) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        Collections.sort(list);
        System.out.println("Sorted: " + list);


    }

    public static void main(String[] args) {
        sortList("b", "c", "a", "e", "a", "c", "e", "f", "b", "a", "f", "b", "c", "a", "e", "a");
    }
}
