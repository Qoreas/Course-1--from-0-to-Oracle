package HomeWork.Lessons_10_per_19.L_13;

public class Months_V2 {
    static void showMonthDays(int number) { // year 2015
        switch (number) {
            default:
                System.out.println("������ �������� ���������� ����� ������"); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("����� ����� 31 ����"); break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("����� ����� 30 ����"); break;

            case 2:
                System.out.println("������� ����� 28 ����"); break;
        }
    }
    public static void main(String[] args) {
        showMonthDays(12);
    }
}
