package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class test_1 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        List<String> list = List.of("hi", "bye");
        System.out.println(list);

        List<String> list2 = List.copyOf(all);
        System.out.println(list2);
    }
}
