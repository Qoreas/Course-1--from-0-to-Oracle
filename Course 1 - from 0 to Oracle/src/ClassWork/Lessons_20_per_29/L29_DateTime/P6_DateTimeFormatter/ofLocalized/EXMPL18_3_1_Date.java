package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter.ofLocalized;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EXMPL18_3_1_Date {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, Month.SEPTEMBER, 29);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));

        System.out.println(ldt);
        System.out.println(ldt.format(shortFormat));

    }
}
