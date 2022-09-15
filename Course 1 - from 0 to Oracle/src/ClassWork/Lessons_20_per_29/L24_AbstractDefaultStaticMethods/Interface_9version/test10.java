package ClassWork.Lessons_20_per_29.L24_AbstractDefaultStaticMethods.Interface_9version;

public class test10 {
}

interface I1 {
    private static void method1() {
        System.out.println("Static method 1");
    }

    private void method2() {
        System.out.println("non static/abstract method");
    }

    abstract void method3();

    default void method4() {
        method1();
    }

    static void method5() {
        method1();

    }
}
