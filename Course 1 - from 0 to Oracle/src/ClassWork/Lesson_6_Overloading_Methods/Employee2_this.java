package ClassWork.Lesson_6_Overloading_Methods;

public class Employee2_this {


    public Employee2_this(String surname3, int age3) {
        this(0, surname3, age3, 0.0, 0);
    }
    Employee2_this(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, 0);
    }
    Employee2_this(int idSet, String surnameSet, int ageSet, double salarySet, int deportmentSet) {
        id = idSet;
        surname = surnameSet;
        age = ageSet;
        salary = salarySet;
        deportment = deportmentSet;
    }
     int id;  String surname; int age;  double salary; int deportment;
}

class Employee2This_test {
    public static void main(String[] args) {
        Employee2_this test = new Employee2_this(1, "Ivanov", 20);
        System.out.println(test.id);

        Employee2_this test1 = new Employee2_this("Ishakov", 19);
        System.out.println(test1.surname);

        Employee2_this test2 = new Employee2_this(2, "Kukuhov", 23, 100, 2);
        System.out.println(test2.deportment);
    }
}