package ClassWork.Lessons_20_per_29.L29_DateTime.P4_infoDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class EXMPL16_use {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, Month.SEPTEMBER, 29);
        LocalDateTime ldt = LocalDateTime.of(2013, Month.MARCH, 8, 15, 40);

        // Data type -- DayOfWeak
        System.out.println(ldt.getDayOfWeek());

    }
}
