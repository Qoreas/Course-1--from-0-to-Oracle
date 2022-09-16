package HomeWork.Lessons_1_per_9.L6;

public class EX1 {

    void calculate(int one, int two, int three, int four) {
        int result = one + two + three + four;
        System.out.println(result);
    }

    void calculate(int one, int two, int three) {
        int result = one + two + three;
        System.out.println(result);
    }

    void calculate(int one, int two) {
        int result = one + two;
        System.out.println(result);
    }

    void calculate(int one) {
        System.out.println(one);
    }

    void calculate() {
        System.out.println(0);
    }
}

class EX1_Test {
    public static void main(String[] args) {
        EX1 test = new EX1();
        test.calculate(1, 2, 3, 4);
        test.calculate(1, 2, 3);
        test.calculate(1, 2);
        test.calculate(1);
        test.calculate();
    }
}