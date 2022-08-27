package ClassWork.Lessons_20_per_29.L_25_Polimorphism;

public class casting_primitive_DataType {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(7);
        final int i1 = 4;
        short s2 = i1;

        short s3 = (short) i1;

        byte b2 = 127;
        short s1 = 3_999;
        char c = 100;

        long l1 = 1;
        int i2 = (int) l1;

        int i10 = 111_111;
        short s10 = (short) i10;
        System.out.println(s10);

        char c10 = (char) -8;
        System.out.println(c10);

        boolean b10 = true;
//        int i11 = (int) b10;
        int i12 = (int) 3.14;
        System.out.println(i12);

        double d = 844.44;
        byte b11 = (byte) d;
        System.out.println(b11);


        int i20 = 2147483647;
        System.out.println(i20 + 1);
    }
}
