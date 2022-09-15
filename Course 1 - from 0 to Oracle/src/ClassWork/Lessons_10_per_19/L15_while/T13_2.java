package ClassWork.Lessons_10_per_19.L15_while;

public class T13_2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0) {
            System.out.println("Bet");
            System.out.println("You lose");
            money -= 10;
        }
    }
}
