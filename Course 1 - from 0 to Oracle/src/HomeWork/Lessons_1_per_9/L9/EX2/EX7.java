package HomeWork.Lessons_1_per_9.L9.EX2;

public class EX7 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b); // 2
        System.out.println(a); // ввод - 22020
        System.out.println(this.a); // а - параметр
        System.out.println(EX7.b); // и снова b
    }

    public static void main(String[] args) {
        EX7 test = new EX7();
        test.abc(22020);
    }
}
