package ClassWork.Lessons_20_per_29.L23_OverridingHidingFinal;

public class test09 {
    public static void main(String[] args) {
        Employee teacher = new Teacher();
        Employee employee = new Employee();
        Teacher teacher1 = new Teacher();
//        employee.sleep
        teacher1.sleep();
        teacher.sleep();

        System.out.println(teacher1.salary);
    }
}

class food {}
class fruits extends food {}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    food eat() {
        System.out.println("Employee eating");
        food f = new food();
        return f;
    }
    static void sleep() {
        System.out.println("Employee is sleeping");
    }
}

class Teacher extends Employee {
    int countOfStudents;
    double salary = 200;
    @Override

    food eat() {
        System.out.println("Teacher eating");
        fruits f = new fruits();
        return f;
    }
    void teach() {
        System.out.println("Teaching");

    }

    static void sleep() {
        System.out.println("Teacher is sleeping");
    }
}


//final class T {}
//class P extends T{}