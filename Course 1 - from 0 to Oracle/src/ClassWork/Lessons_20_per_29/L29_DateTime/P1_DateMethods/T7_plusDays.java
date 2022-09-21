package ClassWork.Lessons_20_per_29.L29_DateTime.P1_DateMethods;

import java.time.LocalDate;
import java.time.Month;

public class T7_plusDays {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.APRIL, 4);
        System.out.println(ld);
        ld = ld.plusDays(30);
        System.out.println(ld);
    }
}
