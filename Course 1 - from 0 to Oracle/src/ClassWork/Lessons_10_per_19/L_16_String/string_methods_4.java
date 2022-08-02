package ClassWork.Lessons_10_per_19.L_16_String;

public class string_methods_4 {
    public static void main(String[] args) {

        System.out.println("Маленький регистр");
        String hi = "HELLO THERE";
        String s = hi.toLowerCase();
        System.out.println(s);

        System.out.println();
        System.out.println("Большой регистр");
        String hi2 = "hello there";
        String s2 = hi2.toUpperCase();
        System.out.println(s2);

        System.out.println();
        System.out.println("Содержит ли");
        String hi3 = "hello there";
        boolean b = hi3.contains("ll");
        System.out.println(b);
    }
}
