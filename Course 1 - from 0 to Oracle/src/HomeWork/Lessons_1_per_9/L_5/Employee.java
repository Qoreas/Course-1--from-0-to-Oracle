package HomeWork.Lessons_1_per_9.L_5;

public class Employee {
    Employee(int idSet, String surnameSet, int ageSet, double salarySet, int deportmentSet) {
        id = idSet;
        surname = surnameSet;
        age = ageSet;
        salary = salarySet;
        deportment = deportmentSet;
    }

    int id;
    String surname;
    int age;
    double salary;
    int deportment;

    double salaryDouble() {
        salary *= 2;
        return salary;
    }
}

class Employee_test {
    public static void main(String[] args) {
        Employee worker1 = new Employee(1, "Izet", 28, 3000, 32);
        Employee worker2 = new Employee(2, "Her", 40, 1000, 32);

        System.out.println(worker1.salaryDouble());
        System.out.println(worker2.salaryDouble());
    }
}
