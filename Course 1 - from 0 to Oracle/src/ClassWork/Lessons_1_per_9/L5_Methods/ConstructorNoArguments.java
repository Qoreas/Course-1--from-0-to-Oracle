package ClassWork.Lessons_1_per_9.L5_Methods;

public class ConstructorNoArguments {
    ConstructorNoArguments(String color1, String engine1) {
        System.out.println("Object is created");
        engine = engine1;
        color = color1;
        System.out.println("Color: " + color + ", engine: " + engine);
    }
    String color;
    String engine;
}

class ConstructorNoArgumentsTest {
    public static void main(String[] args) {
        ConstructorNoArguments Mers = new ConstructorNoArguments("Red", "V8");

        ConstructorNoArguments Audi = new ConstructorNoArguments("Blue", "V12");
    }
}