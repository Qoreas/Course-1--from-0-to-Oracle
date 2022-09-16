package ClassWork.Lessons_20_per_29.L22_OOP.Inheritance;

public class Extends {
    void plusSalary(Employee employee) {
        employee.salary += 100;
    }

    public static void main(String[] args) {
        Doc doc = new Doc();
        doc.name = "Ivan";
        doc.age = 25;
        doc.experience = 10;
        doc.eat();
        doc.heal();

    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {System.out.println("Eating");}
    void sleep() {System.out.println("Sleeping");}
}


class Doc extends Employee{
    void heal() {System.out.println("Healing");}
}

class medBrother extends Doc {
    String scalp;
    void operation() {}
}

class Dentist extends Doc {

}






class Teacher extends Employee{
    int countOfStudents;

    void teach() {System.out.println("Teaching");}
}

class Driver extends Employee{
    String carName;

    void drive() {System.out.println("Driving");}
}
