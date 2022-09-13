package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.RunTimeExceptions;

public class NumberFormatException_15 {
    public static void main(String[] args) {
        Integer.parseInt("33ab");
        Integer.parseInt("33ab", 16);
    }
}
