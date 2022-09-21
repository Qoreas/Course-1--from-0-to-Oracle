package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EXMPL_18_4_parse {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 32);
        LocalDate ld = LocalDate.of(2020, Month.SEPTEMBER, 29);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate date1 = LocalDate.parse("01 02 2015", format);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2015-01-12"); // by default
        System.out.println(date2);
    }
}
