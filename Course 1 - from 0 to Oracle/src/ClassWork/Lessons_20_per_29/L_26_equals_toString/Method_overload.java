package ClassWork.Lessons_20_per_29.L_26_equals_toString;

public class Method_overload {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }


    void def(Object ob) {
        System.out.println("Object");
    }

    void def(String ob) {
        System.out.println("String");
    }


    void ghi(int a, int b) {
        System.out.println("int");
    }

    void ghi(long a, long b) {
        System.out.println("long");
    }

    void ghi(Integer a, Integer b) {
        System.out.println("Integer");
    }

    void ghi(int... a) {
        System.out.println("Varargs");
    }


    public static void main(String[] args) {
        Method_overload t = new Method_overload();
        t.abc(5);

        t.def("hello");
        t.def(new StringBuilder("hello"));

        t.ghi(1, 2);
    }
}
