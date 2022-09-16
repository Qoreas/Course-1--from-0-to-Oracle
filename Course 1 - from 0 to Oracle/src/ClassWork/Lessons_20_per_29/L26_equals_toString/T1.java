package ClassWork.Lessons_20_per_29.L26_equals_toString;

public class T1 {
    int a = 3;

    T1() {
        a = 4;
    }

    {
        a = 5;
    }

//    public static void main(String[] args) {
//        T01 t = new T01();
//        System.out.println(t.a); // = 4
//    }
}

class A {
    static final int b;

    static {
        b = 10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
//        e = 2;
        f = 0;
    }
}

class C {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

     {
        i++;
        System.out.println(i);
    }

    C() {
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hi everyone");
        C c = new C();
    }
}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);

    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D();
    }

    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}