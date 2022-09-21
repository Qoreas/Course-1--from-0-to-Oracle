package ClassWork.Lessons_20_per_29.L29_DateTime.P0_Tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class T5_ofDateTime {
    public static void main(String[] args) {
        LocalDateTime ltd1 = LocalDateTime.of(2000, Month.APRIL, 1, 20, 11);
        System.out.println(ltd1);

        LocalDateTime ltd2 = LocalDateTime.of(2000, Month.APRIL, 1, 20, 11, 59);
        System.out.println(ltd2);

        LocalDateTime ltd3 = LocalDateTime.of(2000, Month.APRIL, 1, 20, 11, 59, 9999);
        System.out.println(ltd3);

        System.out.println("------------");

        LocalDate ld = LocalDate.of(2000, Month.AUGUST, 20);
        LocalTime lt = LocalTime.of(20, 3, 40);

        LocalDateTime ltd4 = LocalDateTime.of(ld, lt);
        System.out.println(ltd4);
    }
}
