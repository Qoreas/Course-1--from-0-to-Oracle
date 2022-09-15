package HomeWork.Lessons_1_per_9.L9.Ex2;

public class Ex7 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b); // 2
        System.out.println(a); // ввод - 22020
        System.out.println(this.a); // а - параметр
        System.out.println(Ex7.b); // и снова b
    }

    public static void main(String[] args) {
        Ex7 test = new Ex7();
        test.abc(22020);
    }
}
