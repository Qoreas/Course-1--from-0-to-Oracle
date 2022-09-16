package HomeWork.Lessons_1_per_9.L9.EX2;

public class EX6 {
    int a = 1;
    static int b = 444;

    static void abc(final int a) {
        System.out.println(a); // сначала вывод этой а
        System.out.println(EX6.b); // потом вывод переменной, которая является собственноесть EX6 - то есть вывод Б
    }

    public static void main(String[] args) {
        abc(9);
    }
}
