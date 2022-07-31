package ClassWork.Lessons_10_per_19.L_15_while;

public class test13_2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
        }
    }
}
