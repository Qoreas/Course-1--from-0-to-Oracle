package ClassWork.Lessons_10_per_19.L_15_while;

public class test13_9 {
    public static void main(String[] args) {
        int hour = 0;

        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }
}
