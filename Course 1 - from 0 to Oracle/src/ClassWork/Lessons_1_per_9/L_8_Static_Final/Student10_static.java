package ClassWork.Lessons_1_per_9.L_8_Static_Final;

public class Student10_static {
    String name; int course; static int count; int a;

    public Student10_static(String nameSet, int courseSet) {
        count++;
        name = nameSet;
        course = courseSet;
        System.out.println("Студент номер " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Всего создано - " + count + " студентов");
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
        Student10_static st2 = new Student10_static("petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
    }
}