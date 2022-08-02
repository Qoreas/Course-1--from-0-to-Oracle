package ClassWork.Lessons_10_per_19.L_16_String;

public class equals {
    public static void main(String[] args) {
        String s1 = new String("Ok");
        String s2 = new String("Ok");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "hu";
        String s4 = "hu";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1 != s4);

        String s5 = "Как дела";
        String s6 = "как дела";
        System.out.println(s6.equalsIgnoreCase(s5));
    }
}
