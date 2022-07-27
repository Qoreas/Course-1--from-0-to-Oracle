package ClassWork.Lessons_1_per_9.Lesson_8_Static_Final;

public class Car {
    String color = "blue";
    String engine = "v6";

}

class human {
    String name = "Vanya";
    final Car c = new Car();

    public static void main(String[] args) {
        human h1 = new human();
        h1.c.engine = "v4";
    }
}