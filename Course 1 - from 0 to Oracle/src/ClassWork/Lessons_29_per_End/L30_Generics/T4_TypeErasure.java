package ClassWork.Lessons_29_per_End.L30_Generics;

import java.util.ArrayList;

public class T4_TypeErasure {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        // JVM view
        ArrayList list2 = new ArrayList();
        int a = (Integer) list2.get(0);
    }

}

class genMethod2 {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
