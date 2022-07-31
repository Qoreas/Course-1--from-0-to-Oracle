package ClassWork.Lessons_10_per_19.L_15_while;

public class test13_7 {
    public static void main(String[] args) {
        int a = 0;

        do {
            System.out.println("Сделайте ставку");
            System.out.println("Вы проиграли");
            a -= 10;
        } while (a > 50);
    }
}
