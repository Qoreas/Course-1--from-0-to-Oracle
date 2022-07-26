package Lesson_5_Methods;

public class Method_Call {
    int calculator(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class Method_Call_test {
    public static void main(String[] args) {
        Method_Call sit = new Method_Call();
        int res = sit.calculator(2, 3, 5);

        System.out.println(res);
        System.out.println(sit.calculator(1, 2, 6));
    }
}
