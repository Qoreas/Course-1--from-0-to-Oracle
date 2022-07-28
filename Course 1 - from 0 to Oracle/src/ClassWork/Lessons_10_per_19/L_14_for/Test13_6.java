package ClassWork.Lessons_10_per_19.L_14_for;

public class Test13_6 {
    public static void time() {
            OUTER:
            for (int hour = 0; hour <= 23; hour++) {
                System.out.println("Начало цикла");

            INNER:
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour + ":" + minutes);

                if (minutes == 30) {
                    break OUTER;
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
