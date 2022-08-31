package ClassWork.Lessons_20_per_29.L_26_equals_toString;

public class initializers {
    {
        System.out.println("This is init block 3");
    }

    initializers() {
        System.out.println("This is constructor 1");
    }

    initializers(int a) {
        this();
        System.out.println("This is constructor 2");
    }

    String s1;

    // initializer block -- always do code inside
    {
        // s1 = "Ok";
        // System.out.println("hello");
        // int a = 5;
        // System.out.println(a);

        System.out.println("This is init block 1");
    }

    // static run once and first
    static {
        System.out.println("This is Static init block 1");
    }

    {
        System.out.println("This is init block 2");
    }

    static {
        System.out.println("This is Static init block 2");
    }

//    String s1; or

    public static void main(String[] args) {
        initializers t = new initializers();
        initializers t2 = new initializers(3);

    }
}
