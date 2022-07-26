package ClassWork.Lesson_12A_if_else;

public class Test13_ternary {

    void findMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Max: " + c);
        }
    }

    void abc() {
        String a;
        int b = 10;
        if (b >= 10) {
            a = "privet";
        }

        if (b < 10) {
            a = "poka";
        } else {
            a = "a";
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a:b;

        System.out.println(max);
    }
}
