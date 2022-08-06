package ClassWork.Lessons_10_per_19.L_17_StringBuilder;

public class test {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println(sb1 + " = sb1");
        System.out.println(sb2 + " = sb2");


        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb5 = sb3;
        StringBuilder sb4 = new StringBuilder("123");
        System.out.println(sb3.equals(sb5)); // equals like ==
    }
}
