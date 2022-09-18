package ClassWork.Lessons_20_per_29.L29_DateTime.Local;

import java.time.LocalTime;

public class T4_ofTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(15, 30, 48);
        System.out.println(lt2);

        LocalTime lt3 = LocalTime.of(15, 30, 48, 999999999);
        System.out.println(lt3);
    }
}
