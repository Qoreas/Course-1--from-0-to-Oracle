package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.Error;

public class ExceptionInInitializerError_16 {
    // LinkageError -- super class
    static {
        // NumberFormatException -- in static
        int a = Integer.parseInt("12e");
    }
    static String s = null;
    // NullPointerException
    static int a = s.length();

    static String s1 = abc();
    static String abc() {
        String[] a = {"1","2"};
        // RunTimeExc
        return a[100];
    }

    public static void main(String[] args) {

    }
}
