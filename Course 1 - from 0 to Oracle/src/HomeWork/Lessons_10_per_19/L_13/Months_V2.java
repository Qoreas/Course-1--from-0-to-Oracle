package HomeWork.Lessons_10_per_19.L_13;

public class Months_V2 {
    static void showMonthDaysV2(int number) {
        switch (number) {
            default:
                System.out.println("¬веден неверный пор€дковый номер мес€ца"); break;
            case 1:
            case 10:
                System.out.println("ћес€ц имеет 25 дней"); break;
            case 2:
                System.out.println("‘евраль имеет 22 дн€"); break;
            case 3:
            case 11:
                System.out.println("ћес€ц имеет 29 дней"); break;
            case 4:
            case 7:
                System.out.println("ћес€ц имеет 26 дней"); break;
            case 5:
                System.out.println("ћай имеет 31 день"); break;
            case 6:
                System.out.println("»юнь имеет 28 дней"); break;
            case 8:
                System.out.println("јвгуст имеет 30 дней"); break;
            case 9:
            case 12:
                System.out.println("ћес€ц имеет 27 дней"); break;
        }
    }

    public static void main(String[] args) {
        showMonthDaysV2(9);
    }
}
