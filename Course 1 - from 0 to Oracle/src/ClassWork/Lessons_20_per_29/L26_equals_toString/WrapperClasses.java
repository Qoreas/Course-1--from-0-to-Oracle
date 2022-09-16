package ClassWork.Lessons_20_per_29.L26_equals_toString;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing
        list.add(5);
        Long l = 50L;

        // Unboxing
        int a = list.get(0);

//        Number b = new Integer(10);
//        int c = (int) b;
//
//        switch (b) {}

        // Parse
//        String s1 = " 50";
//        int i1 = Integer.parseInt(s1);
//        System.out.println(i1);

        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

        // valueOf
        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);

        String s3 = "3.14";
        Double d2 = Double.valueOf(s3);
        System.out.println(d2);

        //Byte b10 = new Byte((byte)5);

        //Integer i4 = new Integer(6);
    }
}
