package HomeWork.Lessons_1_per_9.L8;

public class EX1 {
    static int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    static void division(double a, double b) {
        double result1 = a / b;
        double result2 = a % b;
        System.out.println("Integer division: " + result1 + ", remainder: " + result2);
    }
}

class EX1_Test {
    public static void main(String[] args) {
        System.out.println(EX1.multiplication(1, 2, 3));
        System.out.println(EX1.multiplication(2, 3, 4));
        EX1.division(5, 2);
        EX1.division(5, 2);
    }
}