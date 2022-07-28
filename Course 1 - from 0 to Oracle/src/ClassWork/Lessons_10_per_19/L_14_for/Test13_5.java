package ClassWork.Lessons_10_per_19.L_14_for;

public class Test13_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i == 10) {
                continue;
            }

            if (i % 55 == 0) {
                break;
            }

            System.out.println(i);
        }
    }
}
