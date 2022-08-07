package HomeWork.Lessons_1_per_9.L_9.Ex2;

public class Ex5 {
    static int a = 2;

    void abc(int a) {
        System.out.println(a); // first will display the entered number
        System.out.println(this.a); // then THIS variable
    }

    public static void main(String[] args) {
        Ex5 test = new Ex5();
        test.abc(10);
    }
}