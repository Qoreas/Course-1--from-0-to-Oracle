package ClassWork.Lessons_29_per_End.L30_Generics;

import java.util.ArrayList;

public class T3_ParameterizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(30);
        list1.add(150);

        int a = genMethod.getSecondElement(list1);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        String s = genMethod.getSecondElement(list2);
        System.out.println(s);
    }

}

class genMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}