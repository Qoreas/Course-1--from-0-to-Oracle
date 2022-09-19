package ClassWork.Lessons_20_per_29.L29_DateTime.P1_Local.P1_DateMethods;

import java.time.LocalDate;
import java.time.Month;

public class T8_minusDays {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.APRIL, 4);
        System.out.println(ld);
        ld = ld.minusDays(30);
        System.out.println(ld);
    }
}
