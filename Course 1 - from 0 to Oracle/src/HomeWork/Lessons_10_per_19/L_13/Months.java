package HomeWork.Lessons_10_per_19.L_13;

public class Months {
    static void showMonthDays(int number) { // year 2015
        switch (number) {
            default:
                System.out.println("¬веден неверный пор€дковый номер мес€ца"); break;
            case 1:
                System.out.println("январь имеет 31 дней"); break;
            case 2:
                System.out.println("‘евраль имеет 28 дн€"); break;
            case 3:
                System.out.println("ћарт имеет 31 дней"); break;
            case 4:
                System.out.println("јпрель имеет 30 дней"); break;
            case 5:
                System.out.println("ћай имеет 31 день"); break;
            case 6:
                System.out.println("»юнь имеет 30 дней"); break;
            case 7:
                System.out.println("»юнь имеет 31 дней"); break;
            case 8:
                System.out.println("јвгуст имеет 30 дней"); break;
            case 9:
                System.out.println("—ент€брь имеет 30 дней"); break;
            case 10:
                System.out.println("ќкт€брь имеет 31 дней"); break;
            case 11:
                System.out.println("Ќо€брь имеет 30 дней"); break;
            case 12:
                System.out.println("ƒекабрь имеет 31 дней"); break;
        }
    }

    public static void main(String[] args) {
        showMonthDays(12);
    }
}
