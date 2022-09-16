package ClassWork.Lessons_20_per_29.L24_AbstractDefaultStaticMethods.Methods_interface;

public class T1 {
}

interface I1 {
    void abc();

    // default has code -- override in target class
    default void def() {
        System.out.println("This is def method ");
    }

    static void ert() {
        System.out.println("Static method I1");
    }
}

interface I2 extends I1 {
    @Override
    default void def() {
    }

    static void ert() {
        System.out.println("Static method I2");
    }
}


class R {
    //    @Override
//    public void def() {
//        System.out.println("Hi");
//    }
    R method() {
        return new R();
    }

    public static void main(String[] args) {
//        I1.ert();
//        I2.ert();
    }
}


//class D implements I1{
//    @Override // can not to override default
//    public void abc() {
//        System.out.println("This is abc method ");
//    }
//
//    public static void main(String[] args) {
//        D d = new D();
//        d.abc();
//        d.def();
//    }
//}