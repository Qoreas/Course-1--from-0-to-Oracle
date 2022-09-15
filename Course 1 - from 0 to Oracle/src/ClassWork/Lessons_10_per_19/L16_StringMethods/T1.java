package ClassWork.Lessons_10_per_19.L16_StringMethods;

public class T1 {
    String color;
    String engine;

    T1(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public T1 abc(String color) {
        T1 c = new T1(color, "V4");
        return c;
    }

    public static void main(String[] args) {
        T1 c = new T1("red", "V6");
        T1 c3 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c3.color);
    }
}
