package ClassWork.Lessons_1_per_9.L6_OverloadingMethods;

public class Method_Overload_return_type {
    // different return type
    // access modifier different
    public int cal(int one, int two) {
        return one + two;
    }

    protected String cal(String one, String two) {
        return one + two;
    }
}


class Method_Overload_return_type_test {
    public static void main(String[] args) {
        Method_Overload_return_type test = new Method_Overload_return_type();
        int a = test.cal(5, 4);
        System.out.println(a);

        String b = test.cal("hi", " gey");
        System.out.println(b);
    }
}
