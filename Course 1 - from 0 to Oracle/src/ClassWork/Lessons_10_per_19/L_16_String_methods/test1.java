package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class test1 {
    String color;
    String engine;

    test1(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public test1 abc(String color) {
        test1 c = new test1(color, "V4");
        return c;
    }

    public static void main(String[] args) {
        test1 c = new test1("red", "V6");
        test1 c3 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c3.color);
    }
}
