package HomeWork.Lessons_1_per_9.L8;

public class EX2 {
    public static final double pi = 3.12;

    public double calS(double radius) {
        return pi * radius * radius;
    }

    public static double calLength(double radius) {
        return 2 * pi * radius;
    }

    public void showInfo(double radius) {
        double S = calS(radius);
        double length = calLength(radius);
        System.out.println("Radius: " + radius + ". S: " + S + ". Length: " + length);
    }
}

class EX2_Test {
    public static void main(String[] args) {
        EX2 test = new EX2();

        test.calS(2);
        EX2.calLength(2);
        test.showInfo(2);
    }
}