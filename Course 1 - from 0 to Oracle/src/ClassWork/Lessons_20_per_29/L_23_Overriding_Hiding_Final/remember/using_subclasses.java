package ClassWork.Lessons_20_per_29.L_23_Overriding_Hiding_Final.remember;

public class using_subclasses {
    public static void main(String[] args) {
        Doc d = new Doc();
        Teacher t = new Teacher();
        Driver driver = new Driver();
        Employee emp = new Employee();

        // new
        Employee emp2 = new Doc();
        Employee teacher = new Teacher();
        Employee driver1 = new Driver();

        medBrother m = new medBrother();
        Doc d2 = new medBrother();
        Employee employee = new medBrother();
    }
}

class Extends {
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


class Doc extends Employee {
    void heal() {System.out.println("Healing");}
}

class medBrother extends Doc {
    String scalp;
    void operation() {}
}


class Teacher extends Employee {
    int countOfStudents;

    void teach() {System.out.println("Teaching");}
}

class Driver extends Employee {
    String carName;

    void drive() {System.out.println("Driving");}
}