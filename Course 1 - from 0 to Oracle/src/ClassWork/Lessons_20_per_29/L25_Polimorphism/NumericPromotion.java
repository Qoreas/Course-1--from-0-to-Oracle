package ClassWork.Lessons_20_per_29.L25_Polimorphism;

public class NumericPromotion {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
//        i = (int)(i * l);
        i *= l; // automatic Casting

        // convert i to long type - Casting
        System.out.println(i + l);

        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);

        byte b = 3;
        short s = 4;
        char c = 5;

        System.out.println(b + c + s);

        // can not be converted
        System.out.println(b++);

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        double d3 = b2 + f2 - d2;
        System.out.println(b2 + f2 - d2);

        double d10 = 3.12;
        float f10 = 6.23f;

        float f11 = 0 * 1.5f;
        float f12 = 0 * (float)1.5;

    }
}
