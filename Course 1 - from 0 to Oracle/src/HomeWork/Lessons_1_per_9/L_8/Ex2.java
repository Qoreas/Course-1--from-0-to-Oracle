package HomeWork.Lesson_8;

public class Ex2 {
    public static final  double pi = 3.12;

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

class Ex2_test {
    public static void main(String[] args) {
        Ex2 test = new Ex2();

        test.calS(2);
        Ex2.calLength(2);
        test.showInfo(2);
    }
}