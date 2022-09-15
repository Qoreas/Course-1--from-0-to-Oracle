package ClassWork.Lessons_20_per_29.L24_AbstractDefaultStaticMethods.Interface_implement;

public class Emp {
    public static void main(String[] args) {
        helpAble h = new Driver();
        swimAble s = new Driver();
        Employee e = new Driver();
        h.fireClear("water");
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Driver extends Employee implements helpAble, swimAble {
    String carName;

    void drive() {
        System.out.println("Driving");
    }

    @Override
    public void fireClear(String s) {
        System.out.println("Driver clearing fire with " + s);
    }

    @Override
    public void firstAid() {
        System.out.println("Driver helping");
    }

    @Override
    public void swim() {
        System.out.println("Driver swimming");
    }
}

class Teacher extends Employee implements helpAble {

    int countOfStudents;

    void teach() {
        System.out.println("Teaching");
    }

    @Override
    public void firstAid() {
        System.out.println("Teacher helping");
    }

    @Override
    public void fireClear(String s) {
        System.out.println("Teacher clearing fire with " + s);
    }

}

// has abstract methods
interface helpAble {
    void firstAid();

    void fireClear(String object);
}

interface swimAble {
    void swim();

}