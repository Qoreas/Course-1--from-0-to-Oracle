package ClassWork.Lessons_1_per_9.L8_StaticFinal;

public class Student10Static {
    String name;
    int course;
    static int count;
    int a;

    public Student10Static(String nameSet, int courseSet) {
        count++;
        name = nameSet;
        course = courseSet;
        System.out.println("Student number " + count + " created");
    }

    public static void showCount() {
        System.out.println("Total created - " + count + " students");
    }

    public void showInfo() {
        System.out.println("Welcome to the student class!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student10Static st2 = new Student10Static("petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
    }
}