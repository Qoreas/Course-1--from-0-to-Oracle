package HomeWork.Lessons_20_per_29.L29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class T1 {
    static DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static void change(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        while (start.isBefore(end)) {
            System.out.println("Working with " + start.format(format1));

            start = start.plus(period);
            System.out.println("Until: " + start.format(format1));

            System.out.println("Rest from: " + start.format(format2));

            start = start.plus(duration);
            System.out.println("Until: " + start.format(format2));
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
