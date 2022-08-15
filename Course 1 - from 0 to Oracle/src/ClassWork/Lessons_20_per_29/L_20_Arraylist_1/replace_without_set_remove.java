package ClassWork.Lessons_20_per_29.L_20_Arraylist_1;

import java.util.ArrayList;

public class replace_without_set_remove {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("wer");
        StringBuilder sb3 = new StringBuilder("fr");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }

        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list.remove(2);
        list.remove(sb1);


        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
    }
}
