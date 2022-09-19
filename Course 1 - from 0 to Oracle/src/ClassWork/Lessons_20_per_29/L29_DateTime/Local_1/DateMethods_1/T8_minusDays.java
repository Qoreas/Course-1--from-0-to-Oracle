package ClassWork.Lessons_20_per_29.L29_DateTime.Local_1.DateMethods_1;

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
