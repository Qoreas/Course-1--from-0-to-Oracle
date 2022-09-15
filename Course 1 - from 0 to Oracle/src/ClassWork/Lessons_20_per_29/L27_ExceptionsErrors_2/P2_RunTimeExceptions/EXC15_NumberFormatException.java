package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P2_RunTimeExceptions;

public class EXC15_NumberFormatException {
    public static void main(String[] args) {
        Integer.parseInt("33ab");
        Integer.parseInt("33ab", 16);
    }
}
