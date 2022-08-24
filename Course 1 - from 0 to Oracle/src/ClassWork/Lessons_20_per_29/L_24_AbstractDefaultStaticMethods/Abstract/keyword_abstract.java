package ClassWork.Lessons_20_per_29.L_24_AbstractDefaultStaticMethods.Abstract;

public class keyword_abstract {
    public static void main(String[] args) {
        form f1 = new cube();
        System.out.println(f1.countOfSide);
        f1.S();
    }
}

abstract class form {

    int countOfSide;

    abstract void P();

    abstract void S();

    void showInfo() {
        System.out.println("This is form");
    }
}

class cube extends form {

    int countOfSide = 4;
    int side1 = 10;

    public void P() {
        System.out.println("P of cube = " + 4 * side1);
    }

    public void S() {
        System.out.println("S of cube = " + side1 * side1);
    }
}

class rectangle extends form {
    int countOfSide = 4;
    int side1 = 8;
    int side2 = 4;

    public void P() {
        System.out.println("P of rectangle = " + 2 * (side1 + side2));
    }

    public void S() {
        System.out.println("S of rectangle = " + side1 * side2);
    }
}

class circle extends form {
    int countOfSide = 0;
    int radius = 3;

    public void P() {
        System.out.println("P of circle = " + 2 * Math.PI * radius);
    }

    public void S() {
        System.out.println("S of circle = " + Math.PI * radius * radius);
    }
}

abstract class fourSide extends form {
    void def() {
        System.out.println("This is fourSide");
    }
}