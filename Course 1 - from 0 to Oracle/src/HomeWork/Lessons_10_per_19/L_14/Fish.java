package HomeWork.Lessons_10_per_19.L_14;

public class Fish {
    static void showTime() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {

            System.out.println("Beginning of the main loop");

            MIDDLE:
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hour > 1 && minutes % 10 == 0) {
                    System.out.println("End method");
                    break OUTER;
                }

                INNER:
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (seconds * hour > minutes) {
                        System.out.println("next minute");
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minutes + ":" + seconds);
                }
            }
            System.out.println("End of main loop");
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
