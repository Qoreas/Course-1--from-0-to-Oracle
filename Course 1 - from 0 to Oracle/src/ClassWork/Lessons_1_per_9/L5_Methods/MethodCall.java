package ClassWork.Lessons_1_per_9.L5_Methods;

public class MethodCall {
    int calculator(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class MethodCallTest {
    public static void main(String[] args) {
        MethodCall sit = new MethodCall();
        int res = sit.calculator(2, 3, 5);

        System.out.println(res);
        System.out.println(sit.calculator(1, 2, 6));
    }
}
