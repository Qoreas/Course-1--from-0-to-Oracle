package ClassWork.Lessons_10_per_19.L_16_String;

public class Car7 {
    final static int a = 5;
    String color;
    String engine;

    Car7(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car7 abc(String color) {
        Car7 c10 = new Car7(color, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car7 c = new Car7("red", "V6");
        Car7 c2 = c.abc("Black");
        System.out.println(c.color);
        
    }
}

