package HomeWork.Lessons_1_per_9.L9.EX2;

public class EX5 {
    static int a = 2;

    void abc(int a) {
        System.out.println(a); // first will display the entered number
        System.out.println(this.a); // then THIS variable
    }

    public static void main(String[] args) {
        EX5 test = new EX5();
        test.abc(10);
    }
}