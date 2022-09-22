package HomeWork.Lessons_20_per_29.L29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class T1 {
    static DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, MM/MMMM/yy");

    static void change(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Working with " + ldt1.format(format1));

            ldt1 = ldt1.plus(period);
            System.out.println("Until: " + ldt1.format(format1));

            System.out.println("Rest from: " + ldt1.format(format2));

            ldt1 = ldt1.plus(duration);
            System.out.println("Until: " + ldt1.format(format2));
            System.out.println();

        }
    }

    public static void main(String[] args) {
        LocalDateTime t2 = LocalDateTime.of(2030, Month.SEPTEMBER, 1, 14, 32);
        LocalDateTime t1 = LocalDateTime.of(2030, Month.JULY, 12, 6, 0);
        Period p = Period.ofDays(2);
        Duration d = Duration.ofHours(4);

        change(t1, t2, p, d);
    }
}
