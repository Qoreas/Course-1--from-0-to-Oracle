package HomeWork.Lesson_11A;

public class Car6 {
    public String color; public String engine; public int doors;

}

class car6_test {
    public static void doorsChange(Car6 car, int doors) {
        car.doors = doors;
        System.out.println(car.doors);
    }

    public static void colorChange(Car6 car1, Car6 car2) {
        String change = car2.color;
        car2.color = car1.color;
        car1.color = change;

        System.out.println(car1.color);
        System.out.println(car2.color);
    }

    public static void main(String[] args) {
        Car6 car = new Car6();
        System.out.println(car.doors);

        doorsChange(car, 5);
        car.color = "Red";

        Car6 car2 = new Car6();
        car2.color = "Black";

        colorChange(car, car2);
    }
}