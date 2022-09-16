package ClassWork.Lessons_20_per_29.L25_Polimorphism;

public class T5 {
}

class T10 {
    int a = 5; // hiding
    void abc() {
        System.out.println("Ok1");
    }
}

class T20 {
    int a = 10;
    void abc() {
        System.out.println("Ok2");
    }
}

class T30 extends T20 {
    int a = 15;
    void abc() {
        super.abc();
        System.out.println("Ok3");
    }

    public static void main(String[] args) {
        T30 t = new T30(); // Casting
//        System.out.println(((T10) t).a);
        System.out.println(t.a);
    }
}