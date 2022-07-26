package Lesson_5_Methods;

public class Car_2 {
    String color;
    String engine;
    int speed;

    int speedUp(int count) {
        speed += count;
        return speed;
    }

    int speedDown(int count) {
        speed -= count;
        return speed;
    }

    void showInfo() {
        System.out.println("Car color: " + color + ", engine: " + engine + " and speed: " + speed);
    }
}

class Car_2_test {
    public static void main(String[] args) {
        Car_2 car1 = new Car_2();

        car1.speed = 20;
        car1.color = "Red";
        car1.engine = "V12";

        car1.showInfo();
        car1.speedUp(40);
        car1.showInfo();
        car1.speedDown(60);
        car1.showInfo();
    }
}