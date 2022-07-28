package ClassWork.Lessons_1_per_9.L_5_Methods;

public class Constructor {
    Constructor(String engineSet, String colorSet) {
        engine = engineSet;
        color = colorSet;
    }
    String color;
    String engine;

    void showInfo() {
        System.out.println("Color: " + color + ", engine: " + engine);
    }
}

class Constructor_test {
    public static void main(String[] args) {
        Constructor Mers = new Constructor("V16", "Red");
        System.out.println(Mers.color);
        System.out.println(Mers.engine);
        Mers.showInfo();
    }
}