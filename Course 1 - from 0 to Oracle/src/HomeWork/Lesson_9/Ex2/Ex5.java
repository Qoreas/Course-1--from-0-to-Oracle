package HomeWork.Lesson_9.Ex2;

public class Ex5 {
    static int a = 2;

    void abc(int a) {
        System.out.println(a); // сначала будет вывод введенного числа
        System.out.println(this.a); // потом эта переменная
    }

    public static void main(String[] args) {
        Ex5 test = new Ex5();
        test.abc(10);
    }
}