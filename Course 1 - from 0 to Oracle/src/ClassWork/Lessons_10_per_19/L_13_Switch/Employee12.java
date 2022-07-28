package ClassWork.Lessons_10_per_19.L_13_Switch;

public class Employee12 {
    public static void main(String[] args) {
        int dayWeak = 1;

        switch (dayWeak) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Работа до 18.00"); break;

            case 6:
                System.out.println("Работа до 14.00"); break;
            case 7:
                System.out.println("Работы нет"); break;
            default:
                System.out.println("Такого дня не существует");


        }
    }
}
