package ClassWork.Lessons_20_per_29.L_25_Polimorphism;

public class casting {
    public static void main(String[] args) {
//        helpAble2 h = new Doc2();

//        DownCasting
//        Doc2 d1 = (Doc2) emp1;
//        System.out.println(d1.specialization);
//        d1.heal();
//
//        System.out.println(((Doc2) emp1).specialization);
//        ((Doc2) emp1).heal();
//
//        System.out.println("---------");
//
//        System.out.println(((Doc2) h).specialization);
//        ((Doc2) h).heal();
//        h.help();
//
//        Driver2 d = (Driver2) emp2;  -- ClassCastException
//
//        System.out.println("---------");
//
//        Employee2 emp4 = new Doc2();
//        ((Doc2) emp4).heal();
//
//        Employee2 e = new Employee2();
//
        Employee2 emp1 = new Doc2(); // UpCasting - automation casting
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();

        Employee2 emp4 = new Employee2();
        Employee2[] array = {emp1, emp2, emp3, emp4};

        for (Employee2 e : array) {
            if (e instanceof Driver2) {
                System.out.println(((Driver2) e).carName);
                ((Driver2) e).drive();
            }
        }
    }
}

class Employee2 {
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

class Doc2 extends Employee2 implements helpAble2 {
    String specialization = "Med brother";

    void heal() {
        System.out.println("Healing");
    }

    @Override
    public void help() {
        System.out.println("Doc helps");
    }
}

class Teacher2 extends Employee2 {
    int countOfStudents;

    void teach() {
        System.out.println("Teaching");
    }
}

class Driver2 extends Employee2 {
    String carName = "Mers";

    void drive() {
        System.out.println("Driving");
    }
}

interface helpAble2 {
    void help();
}