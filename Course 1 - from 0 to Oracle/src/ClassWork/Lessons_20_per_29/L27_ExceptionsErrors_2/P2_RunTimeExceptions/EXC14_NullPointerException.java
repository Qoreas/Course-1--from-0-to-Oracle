package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P2_RunTimeExceptions;

import java.util.ArrayList;

public class EXC14_NullPointerException {
    static ArrayList<String> list;
    static doc[] array;

    public static void main(String[] args) {
        list.add("22");
        System.out.println(array[0]);
    }
}