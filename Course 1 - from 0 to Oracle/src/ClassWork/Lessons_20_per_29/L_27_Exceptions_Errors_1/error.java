package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_1;

public class error {
    static void abc() {
        System.out.println("Abc method is working");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError error) {
            System.out.println("Error was caught");

        }

    }
}
