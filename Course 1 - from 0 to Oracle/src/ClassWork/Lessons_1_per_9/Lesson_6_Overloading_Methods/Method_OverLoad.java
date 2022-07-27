package ClassWork.Lessons_1_per_9.Lesson_6_Overloading_Methods;

public class Method_OverLoad {
    // одно имя - разные функции - одинаковый return type
    void show(int num) {
        System.out.println(num + " - number");
    }

    void show(int a, int b) {
        System.out.println(a);
    }

    void show(boolean b) {
        System.out.println(b + " - boolean");
    }

    void show(String s) {
        System.out.println(s + " - string");
    }
    // разные по порядку
    void show(String s, int a) {
        System.out.println("String: " + s + ", " + "number: " + a);
    }

    void show(int a, String s) {
        System.out.println("другой порядок");
    }
}

class Method_OverLoad_test {
    public static void main(String[] args) {
        Method_OverLoad test = new Method_OverLoad();
        int a = 500;
        test.show(a);
        // or
        test.show(500);

        boolean b = true;
        test.show(b);

        String s1 = "Привет";
        test.show(s1);

        test.show("ho", 2);
        test.show(2, "gi");
    }
}