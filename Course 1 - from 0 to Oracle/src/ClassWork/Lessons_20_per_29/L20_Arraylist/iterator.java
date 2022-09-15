package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("hi");
        list.add("bad");
        list.add("good");
        list.add("bye");

        Iterator <String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasNext()) {
            it.next();
            it.remove();
        }

    }
}
