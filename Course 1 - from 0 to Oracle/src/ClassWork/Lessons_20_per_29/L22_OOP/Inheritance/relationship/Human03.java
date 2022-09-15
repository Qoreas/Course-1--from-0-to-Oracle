package ClassWork.Lessons_20_per_29.L22_OOP.Inheritance.relationship;

public class Human03 {
//    public Human03(String name) {
//        this.name = name;
//    }
    String name = "Kolya";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

     static int salary = 150;

     void work() {
        System.out.println("Work!");
    }

     static void rest() {
        System.out.println("Rest!");
    }
}

class student extends Human03 {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.name);
        System.out.println(student.salary);
        s.work();
        student.rest();
    }
}
