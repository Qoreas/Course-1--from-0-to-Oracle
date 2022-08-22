package ClassWork.Lessons_20_per_29.L_23_Overriding_Hiding_Final.method_overriding;

public class overriding {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Employee emp = new Employee();
        emp.eat();
        t.eat();

        Employee emp2 = new Teacher();
        emp2.eat();
    }
}

class food {

}

class fruits extends food {

}

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
    void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacher extends Employee {
    int countOfStudents;
    food eat() {
        System.out.println("Teacher eating");
        fruits f = new fruits();
        return f;
    }
    void teach() {
        System.out.println("Teaching");

    }
}


class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    E objectCreation() {
        System.out.println("ok");
        return new E();
    }
}

class E extends Teacher {

}
