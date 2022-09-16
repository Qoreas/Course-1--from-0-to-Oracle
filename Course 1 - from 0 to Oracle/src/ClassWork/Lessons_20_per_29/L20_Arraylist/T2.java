package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
//        all.add(T2_throw());
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        for (Object o : all) {
            System.out.println("Number = " + o + ", and length: " + ((String)o).length());
        }
    }
}
