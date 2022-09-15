package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P2_RunTimeExceptions;

import java.util.ArrayList;

public class EXC9_OutOfBoundsException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));
    }
}
