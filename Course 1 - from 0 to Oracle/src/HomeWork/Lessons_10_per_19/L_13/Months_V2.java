package HomeWork.Lessons_10_per_19.L_13;

public class Months_V2 {
    static void showMonthDaysV2(int number) {
        switch (number) {
            default:
                System.out.println("������ �������� ���������� ����� ������"); break;
            case 1:
            case 10:
                System.out.println("����� ����� 25 ����"); break;
            case 2:
                System.out.println("������� ����� 22 ���"); break;
            case 3:
            case 11:
                System.out.println("����� ����� 29 ����"); break;
            case 4:
            case 7:
                System.out.println("����� ����� 26 ����"); break;
            case 5:
                System.out.println("��� ����� 31 ����"); break;
            case 6:
                System.out.println("���� ����� 28 ����"); break;
            case 8:
                System.out.println("������ ����� 30 ����"); break;
            case 9:
            case 12:
                System.out.println("����� ����� 27 ����"); break;
        }
    }

    public static void main(String[] args) {
        showMonthDaysV2(9);
    }
}
