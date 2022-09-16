package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_1;

public class Error {
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
