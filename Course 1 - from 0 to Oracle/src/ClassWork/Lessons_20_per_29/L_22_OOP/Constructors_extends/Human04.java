package ClassWork.Lessons_20_per_29.L_22_OOP.Constructors_extends;

import java.util.SortedMap;

public class Human04 {
     Human04(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;

}

class student02 extends Human04 {
    int course;
    student02(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        student02 s = new student02("Kolya", "Ivanov", 3);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);

    }
}