package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter.ofLocalized;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EXMPL18_3_2_Time {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 32, 3);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt);
        System.out.println(lt.format(shortFormat));

        System.out.println(ldt);
        System.out.println(ldt.format(shortFormat));
    }
}
