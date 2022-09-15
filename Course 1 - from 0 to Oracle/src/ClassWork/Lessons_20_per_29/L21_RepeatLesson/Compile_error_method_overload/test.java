package ClassWork.Lessons_20_per_29.L21_RepeatLesson.Compile_error_method_overload;

public class test {
    public void abc(int a, int b) {
        System.out.println("hi");
    }

    public void abc(double a, double b) {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.abc(1, 2);
    }
}
