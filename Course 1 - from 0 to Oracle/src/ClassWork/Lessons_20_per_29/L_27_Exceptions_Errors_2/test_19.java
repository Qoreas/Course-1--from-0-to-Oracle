package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2;

public class test_19 {
    void abc() {
        System.out.println("Method abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("this is finally block");
        }
    }

    public static void main(String[] args) {
        test_19 t = new test_19();
        t.def();
    }
}
