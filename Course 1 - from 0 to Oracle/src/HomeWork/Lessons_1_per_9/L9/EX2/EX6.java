package HomeWork.Lessons_1_per_9.L9.EX2;

public class EX6 {
    int a = 1;
    static int b = 444;

    static void abc(final int a) {
        System.out.println(a); // ������� ����� ���� �
        System.out.println(EX6.b); // ����� ����� ����������, ������� �������� �������������� EX6 - �� ���� ����� �
    }

    public static void main(String[] args) {
        abc(9);
    }
}
