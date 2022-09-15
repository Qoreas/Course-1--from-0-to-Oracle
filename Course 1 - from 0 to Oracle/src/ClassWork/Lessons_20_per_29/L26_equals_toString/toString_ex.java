package ClassWork.Lessons_20_per_29.L26_equals_toString;

import java.util.ArrayList;

public class toString_ex {
    public static void main(String[] args) {
        car01 c1 = new car01("Red", "V8");
        car01 c2 = null;
        car01 c3 = new car01("White", "V6");

        ArrayList<car01> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        car01 c4 = new car01("White", "V6");

        System.out.println(list); // sout(c3); or sout(c3.toString());


    }
}


class car01 {
    String color, engine;

    car01(String color, String engine) {
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

    public String toString() {
        return "Car: " + color + ", with engine: " + engine;
    }
}