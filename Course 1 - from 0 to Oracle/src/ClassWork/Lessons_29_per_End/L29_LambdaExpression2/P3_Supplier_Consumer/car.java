package ClassWork.Lessons_29_per_End.L29_LambdaExpression2.P3_Supplier_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class car {
    String model;
    String color;
    double engine;

    car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car: " + model + ", color is: " + color + ", engine: " + engine;
    }
}

class test {
    public static ArrayList<car> createThreeCar(Supplier<car> supplier) {
        ArrayList<car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static void changeCar(car Car, Consumer<car> consumer) {
        consumer.accept(Car);
    }

    public static void main(String[] args) {
        ArrayList<car> ourCars = createThreeCar(() -> new car("Nissan Tiida", "Black", 4.3));

        System.out.println(ourCars);
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 3.2;
            System.out.println("Updated car: " + car);
        });

//        Consumer<car> consumer = car -> {
//            car.color = "red";
//            car.engine = 3.2;
//            System.out.println("Updated car: " + car);
//        };
//        consumer.accept(ourCars.get(0));

        System.out.println(ourCars);
    }
}
