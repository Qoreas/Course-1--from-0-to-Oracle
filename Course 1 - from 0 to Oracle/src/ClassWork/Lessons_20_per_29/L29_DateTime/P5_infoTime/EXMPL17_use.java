package ClassWork.Lessons_20_per_29.L29_DateTime.P5_infoTime;

import java.time.LocalTime;

public class EXMPL17_use {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(16, 49);

        System.out.println(lt.getNano());
    }
}
