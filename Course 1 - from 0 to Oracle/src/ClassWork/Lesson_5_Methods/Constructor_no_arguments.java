package Lesson_5_Methods;

import javax.sound.sampled.AudioInputStream;

public class Constructor_no_arguments {
    Constructor_no_arguments(String color1, String engine1) {
        System.out.println("Object is created");
        engine = engine1;
        color = color1;
        System.out.println("Color: " + color + ", engine: " + engine);
    }
    String color;
    String engine;
}

class Constructor_no_arguments_test {
    public static void main(String[] args) {
        Constructor_no_arguments Mers = new Constructor_no_arguments("Red", "V8");

        Constructor_no_arguments Audi = new Constructor_no_arguments("Blue", "V12");
    }
}