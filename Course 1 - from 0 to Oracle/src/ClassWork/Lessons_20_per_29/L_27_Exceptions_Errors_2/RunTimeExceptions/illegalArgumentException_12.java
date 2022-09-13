package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.RunTimeExceptions;

public class illegalArgumentException_12 {
    public static void main(String[] args) {
        createPass("");
    }

    public static void createPass(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Password length to small");
        }

        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Password length to high");
        }

        System.out.println("Password was set");
    }
}
