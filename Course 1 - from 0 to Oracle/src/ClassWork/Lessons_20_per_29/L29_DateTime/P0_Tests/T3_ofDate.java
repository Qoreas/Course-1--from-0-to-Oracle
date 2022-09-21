package ClassWork.Lessons_20_per_29.L29_DateTime.P0_Tests;

import java.time.LocalDate;
import java.time.Month;

public class T3_ofDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, 4, 14);
        System.out.println(ld);

        LocalDate ld2 = LocalDate.of(2014, Month.OCTOBER, 14);
        System.out.println(ld2);
    }
}
