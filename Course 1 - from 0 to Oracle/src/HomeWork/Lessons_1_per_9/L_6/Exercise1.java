package HomeWork.Lessons_1_per_9.L_6;

public class Exercise1 {

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

class Exercise1_test {
    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        test.calculate(1, 2, 3, 4);
        test.calculate(1, 2, 3);
        test.calculate(1, 2);
        test.calculate(1);
        test.calculate();
    }
}