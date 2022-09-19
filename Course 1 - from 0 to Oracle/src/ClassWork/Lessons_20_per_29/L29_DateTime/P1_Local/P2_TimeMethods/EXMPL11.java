package ClassWork.Lessons_20_per_29.L29_DateTime.P1_Local.P2_TimeMethods;

import java.time.LocalTime;

public class EXMPL11 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 30);
        System.out.println(lt);
        lt = lt.plusHours(2).minusMinutes(25).minusSeconds(34).plusNanos(3);
        System.out.println(lt);
    }
}
