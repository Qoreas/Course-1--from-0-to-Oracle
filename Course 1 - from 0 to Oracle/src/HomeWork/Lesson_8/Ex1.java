package HomeWork.Lesson_8;

public class Ex1 {
    static int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    static void division(double a, double b) {
        double result1 = a / b;
        double result2 = a % b;
        System.out.println("����� �������: " + result1 + ", �������: " + result2);
    }
}

class Ex1_test {
    public static void main(String[] args) {
        System.out.println(Ex1.multiplication(1, 2, 3));
        System.out.println(Ex1.multiplication(2, 3, 4));
        Ex1.division(5, 2);
        Ex1.division(5, 2);
    }
}