package ClassWork.Lessons_20_per_29.L_23_Overriding_Hiding_Final;

public class keyword_Super {

}

class A10 {
    String s1 = "Hello";
    static double d1 = 3.14;
    int sum(int ... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends A10 {
//    String s1 = super.s1 + ", friend!";
    boolean s1 = true;

    int sum(int ... i) {
        int result = super.sum(i);
        System.out.println("Sum: " + result);
        return result;
    }
    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}