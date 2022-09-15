package HomeWork.Lessons_1_per_9.L2;

public class Types {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0B11_00;
        byte b3 = 014;
        byte b4 = 0xC;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        short s1 = 1_300;
        short s2 = 0B101_0001_0100;
        short s3 = 02_424;
        short s4 = 0x514;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        int i1 = 0;
        int i2 = 0B0;
        int i3 = 00;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        long l1 = 123_456_789L;
        long l2 = 0B111_0101_1011_1100_1101_0001_0101L;
        long l3 = 0726_746_425L;
        long l4 = 0x75B_CD15L;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        float f1 = 50.0F;
        float f2 = 3.14F;
        System.out.println(f1 + " " + f2);

        double d1 = 4488888.44232D;
        double d2 = 74884.200D;
        System.out.println(d1 + " " + d2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 + " " + bool2);

        char c1 = 'a';
        char c2 = 'A';
        char c3 = 777;
        System.out.println(c1 + " " + c2 + " " + c3);

    }
}
