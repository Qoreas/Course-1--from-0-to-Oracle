package HomeWork.Lessons_20_per_29.L_20;

import java.util.ArrayList;
import java.util.Collections;

public class ex2 {
    static void sortList(String ... strings) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println("Adding strings to list");

        Collections.addAll(list, strings);
        System.out.println("Not sorted: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }

        }

        System.out.println("Complete: " + list);
    }

    public static void main(String[] args) {
        sortList("b", "c", "a", "e", "a", "c", "e", "f", "b", "a", "f", "b", "c", "a", "e", "a");
    }
}
