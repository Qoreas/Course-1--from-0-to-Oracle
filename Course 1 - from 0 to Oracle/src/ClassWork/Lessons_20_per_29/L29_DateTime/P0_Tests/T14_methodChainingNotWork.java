package ClassWork.Lessons_20_per_29.L29_DateTime.P0_Tests;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class T14_methodChainingNotWork {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2015, Month.DECEMBER, 21);
//        Period p = Period.ofMonths(3).ofDays(3); // won't work
        Period p = Period.ofMonths(3);
        p = Period.ofDays(13);
        System.out.println(ld1.plus(p));
    }
}
