package ClassWork.Lessons_10_per_19.L12_if_else;

public class Car7 {
    int engine;
    int doorsCount;

    Car7(int engine, int doors) {
        this.engine = doors;
        doorsCount = doors;
    }
}

class car7_test {
    public static void main(String[] args) {
        Car7 c1 = new Car7(4, 4);
        Car7 c2 = new Car7(3, 3);

        if (c1.engine > c2.engine) {
            if (c1.doorsCount > c2.doorsCount) {
                System.out.println("motor power and the number of doors are greater for the first car");
            } else {
                System.out.println("the motor power of the first car is greater, but the number of doors is less");
            }
        } else {
            System.out.println("the engine power of the first car is less");
        }
    }
}