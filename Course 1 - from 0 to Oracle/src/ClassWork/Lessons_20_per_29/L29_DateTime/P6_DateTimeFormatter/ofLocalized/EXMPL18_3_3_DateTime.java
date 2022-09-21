package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter.ofLocalized;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EXMPL18_3_3_DateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(ldt);
        System.out.println(shortFormat.format(ldt));
    }
}
