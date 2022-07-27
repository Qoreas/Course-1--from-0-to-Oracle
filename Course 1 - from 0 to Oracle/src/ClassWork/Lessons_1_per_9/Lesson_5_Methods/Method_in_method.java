package ClassWork.Lessons_1_per_9.Lesson_5_Methods;

public class Method_in_method {
    int calculator(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int median(int a1, int b1, int c1) {
        int result1 = calculator(a1, b1, c1) / 3;
        return result1;
    }
}

class Method_in_method_test {
    public static void main(String[] args) {
        Method_in_method sit = new Method_in_method();
        int res = sit.calculator(2, 3, 5);

        System.out.println(res);
        System.out.println(sit.calculator(1, 2, 6));

        System.out.println(sit.median(1, 2, 3));
    }
}