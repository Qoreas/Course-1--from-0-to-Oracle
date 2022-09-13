package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.RunTimeExceptions;

import java.util.ArrayList;

public class OutOfBoundsException_9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));
    }
}
