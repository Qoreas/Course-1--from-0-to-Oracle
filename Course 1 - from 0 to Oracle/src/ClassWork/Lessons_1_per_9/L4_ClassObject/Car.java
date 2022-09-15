package ClassWork.Lessons_1_per_9.L4_ClassObject;

public class Car {

    String color;
    String engine;
}

class Car_test {
    public static void main(String[] args) {
        Car Audi = new Car();
        Car Opel = new Car();

        Audi.engine = "V6";
        Opel.color = "White";
        System.out.println(Audi.engine);
    }
}