package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.RunTimeExceptions;

import java.util.ArrayList;

public class NullPointerException_14 {
    static ArrayList<String> list;
    static doc[] array;

    public static void main(String[] args) {
        list.add("22");
        System.out.println(array[0]);
    }
}