package HomeWork.Lesson_12A;

public class Student5 {
    public String name; public int age;
    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class Student6_test {
    static void compare(Student5 st1, Student5 st2) {
        if (st1.equals(st2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("they aren't equal");
        }
    }

    static void compareAttributes(Student5 st1, Student5 st2) {
        if (st1.name == st2.name) {
            System.out.println("Names compare");

            if (st1.age == st2.age) {
                System.out.println("Ages compare");
            } else {
                System.out.println("Ages don't compare");
            }

        } else {
            System.out.println("Names don't compare");
        }
    }

    public static void main(String[] args) {
        Student5 st1 = new Student5("Sasha", 17);
        Student5 st2 = new Student5("Sasha", 17);

        compareAttributes(st1, st2);
    }
}