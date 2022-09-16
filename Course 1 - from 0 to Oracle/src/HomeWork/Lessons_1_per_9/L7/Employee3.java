package HomeWork.Lessons_1_per_9.L7;

public class Employee3 {
    public Employee3(String surname3, int age3) {
        this(0, surname3, age3, 0.0, 0);
    }

    Employee3(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, 0);
    }

    private Employee3(int idSet, String surnameSet, int ageSet, double salarySet, int deportmentSet) {
        id = idSet;
        surname = surnameSet;
        age = ageSet;
        salary = salarySet;
        deportment = deportmentSet;
    }

    int id;
    public String surname;
    int age;
    private double salary;
    int deportment;

    public void show(String choose) {
        if (choose.equals("salary")) {
            System.out.println(salary);
        } else if (choose.equals("surname")) {
            System.out.println(surname);
        } else if (choose.equals("id")) {
            System.out.println(id);
        } else {
            System.out.println("Try again. Command list: salary, surname, id.");
        }
    }

    public static void main(String[] args) {
        Employee3 test2 = new Employee3(2, "Kukuhov", 23, 100, 2);
        System.out.println(test2.deportment);

        Employee3 test3 = new Employee3(4, "spe", 15, 100, 9);
        test3.show("idd");
    }
}

class Employee3_Test {
    public static void main(String[] args) {
        Employee3 test = new Employee3(1, "Ivanov", 20);
        System.out.println(test.id);

        Employee3 test1 = new Employee3("Ishakov", 19);
        System.out.println(test1.surname);
    }
}