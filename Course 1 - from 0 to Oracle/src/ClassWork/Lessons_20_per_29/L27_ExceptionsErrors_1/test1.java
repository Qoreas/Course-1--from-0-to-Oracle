package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_1;

public class test1 {
    public static void main(String[] args) {
        animal an = new tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();




    }
}

class animal {
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("Non-static method from animal");
    }
    static void def() {
        System.out.println("Static method from animal");
    }
}


class tiger extends animal {
    int a = 15;
    static int b = 20;
    void abc() {
        System.out.println("Non-static method from tiger");
    }
    static void def() {
        System.out.println("Static method from tiger");
    }
}
