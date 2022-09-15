package ClassWork.Lessons_20_per_29.L26_equals_toString;

import java.util.ArrayList;

public class Equals_Override {
    public static void main(String[] args) {
        car c1 = new car("Red", "V8");
        car c2 = null;
        car c3 = new car("White", "V6");

        ArrayList <car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        car c4 = new car("White", "V6");

        System.out.println(c2.equals(c1));


    }
}

class car {
    String color, engine;

    car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        // is c1 is car01?
        if (obj instanceof car) {
            car c2 = (car) obj;
            return color.equals(c2.color) && engine.equals(c2.engine);
        } else {
            return false;
        }
    }
}