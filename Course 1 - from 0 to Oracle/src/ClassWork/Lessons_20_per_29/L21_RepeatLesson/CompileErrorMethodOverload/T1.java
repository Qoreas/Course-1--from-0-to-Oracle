package ClassWork.Lessons_20_per_29.L21_RepeatLesson.CompileErrorMethodOverload;

public class T1 {
    public void abc(int a, int b) {
        System.out.println("hi");
    }

    public void abc(double a, double b) {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.abc(1, 2);
    }
}
