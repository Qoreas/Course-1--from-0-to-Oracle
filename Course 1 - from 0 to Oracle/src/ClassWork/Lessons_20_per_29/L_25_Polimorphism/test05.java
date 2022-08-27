package ClassWork.Lessons_20_per_29.L_25_Polimorphism;

public class test05 {
}

class test10 {
    int a = 5; // hiding
    void abc() {
        System.out.println("Ok1");
    }
}

class test20 {
    int a = 10;
    void abc() {
        System.out.println("Ok2");
    }
}

class test30 extends test20{
    int a = 15;
    void abc() {
        super.abc();
        System.out.println("Ok3");
    }

    public static void main(String[] args) {
        test30 t = new test30(); // casting
//        System.out.println(((test10) t).a);
        System.out.println(t.a);
    }
}