package HomeWork.Lesson_9.Ex2;

public class Ex6 {
    int a = 1;
    static int b = 444;

    static void abc(final int a) {
        System.out.println(a); // ������� ����� ���� �
        System.out.println(Ex6.b); // ����� ����� ����������, ������� �������� �������������� Ex6 - �� ���� ����� �
    }

    public static void main(String[] args) {
        abc(9);
    }
}
