package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.P1_Tests;

public class T19 {
    void abc() {
        System.out.println("Method abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
        } finally {
            System.out.println("this is finally block");
        }
    }

    public static void main(String[] args) {
        T19 t = new T19();
        t.def();
    }
}
