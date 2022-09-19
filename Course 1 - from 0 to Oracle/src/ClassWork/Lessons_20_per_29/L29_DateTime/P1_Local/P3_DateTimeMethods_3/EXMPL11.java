package ClassWork.Lessons_20_per_29.L29_DateTime.P1_Local.P3_DateTimeMethods_3;

import java.time.LocalDateTime;
import java.time.Month;

public class EXMPL11 {
    // has all time methods
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2048, Month.DECEMBER, 20, 2, 54, 38);
        System.out.println(ldt);
        ldt = ldt.plusYears(2).minusMonths(2).plusMinutes(180).minusSeconds(43);
        System.out.println(ldt);
    }
}
