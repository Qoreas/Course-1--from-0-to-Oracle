package ClassWork.Lessons_1_per_9.L_9_Scope_Variables;

public class Car4 {

    int s;
    int U;
    int $d;
    int _cc;
    final int XYZ = 3; // константа большие буквы

    String color;
    int a = 10;
    String engine;
    public static int count;

    public Car4(String color, String engine) {
        this.color = color;
        this.engine = engine;
        count++;
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car4 car = new Car4("red", "v12");
        System.out.println(car.color);
        car.changeColor("black");
        System.out.println(car.color);
    }
}
