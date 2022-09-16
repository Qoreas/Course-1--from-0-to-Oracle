package HomeWork.Lessons_10_per_19.L15;

public class FishRebuildWhile {
    static void showTime() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            System.out.println("Beginning of the main loop");

            int minutes = -1;
            MIDDLE:
            do {
                minutes++;

                if (hour > 1 && minutes % 10 == 0) {
                    System.out.println("End method");
                    break OUTER;
                }

                int seconds = 0;
                INNER:
                while (seconds < 60) {

                    if (seconds * hour > minutes) {
                        System.out.println("next minute");
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minutes + ":" + seconds);
                    seconds++;
                }

            } while (minutes < 59);

            hour++;
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}
