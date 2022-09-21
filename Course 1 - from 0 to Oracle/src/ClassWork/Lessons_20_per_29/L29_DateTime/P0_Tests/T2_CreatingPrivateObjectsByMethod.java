package ClassWork.Lessons_20_per_29.L29_DateTime.P0_Tests;

public class T2_CreatingPrivateObjectsByMethod {
    public static void main(String[] args) {
    car c = car.createCar();


    }
}

class car {
    private car() {}

    static car createCar () {
        return new car();
    }
}