package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.ArrayList;

public class clone_list_example {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hi");
        StringBuilder s2 = new StringBuilder("Her");
        StringBuilder s3 = new StringBuilder("His");

        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
    }
}
