package ClassWork.Lessons_20_per_29.L29_DateTime.P1_Local;

import java.time.*;

public class T13_Period_forYearDays {
    static void changeDuty(LocalDate start, LocalDate end, Period period) {
        LocalDate date = start;
        while (date.isBefore(end)) {
            System.out.println("Date is - " + date + ". It's time to change the duty command");
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate end = LocalDate.of(2020, Month.MAY, 31);
        Period p = Period.of(1, 3, 15);
        changeDuty(start, end, p);
    }
}
