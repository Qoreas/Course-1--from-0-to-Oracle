package ClassWork.Lessons_20_per_29.L23_OverridingHidingFinal.MethodOverriding;

public class Overriding {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Employee emp = new Employee();
        emp.eat();
        t.eat();

        Employee emp2 = new Teacher();
        emp2.eat();
    }
}

class Food {

}

class Fruits extends Food {

}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    Food eat() {
        System.out.println("Employee eating");
        Food f = new Food();
        return f;
    }
    void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacher extends Employee {
    int countOfStudents;
    Food eat() {
        System.out.println("Teacher eating");
        Fruits f = new Fruits();
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
