package ClassWork.Lessons_20_per_29.L29_DateTime.P0_Tests;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class T15_Duration_forDayHour {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2015, Month.DECEMBER, 21);
        Duration d = Duration.ofHours(2);

        System.out.println(ld1.plus(d));
    }
}
