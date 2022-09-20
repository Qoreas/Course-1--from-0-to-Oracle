package ClassWork.Lessons_20_per_29.L29_DateTime.P1_Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class T12_isAfter_isBefore {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2015, Month.DECEMBER, 21);
        LocalDate ld2 = LocalDate.of(2013, Month.JULY, 2);
//        System.out.println(ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(16, 40);
        LocalTime lt2 = LocalTime.of(6, 3);
//        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.DECEMBER, 21, 20, 34);
        LocalDateTime ldt2 = LocalDateTime.of(2000, Month.OCTOBER, 8, 19, 2, 9);
        System.out.println(ldt1.isAfter(ldt2));



    }
}
