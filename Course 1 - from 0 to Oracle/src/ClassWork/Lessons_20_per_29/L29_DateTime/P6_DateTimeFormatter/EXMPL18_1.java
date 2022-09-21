package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EXMPL18_1 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 32);
        LocalDate ld = LocalDate.of(2020, Month.SEPTEMBER, 29);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        // ISO -- format
        DateTimeFormatter f = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld);
        System.out.println(ld.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
        System.out.println(lt.format(f2));

//        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter f3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(f3));
        System.out.println(ldt.format(f));
        System.out.println(ldt.format(f2));

    }
}
