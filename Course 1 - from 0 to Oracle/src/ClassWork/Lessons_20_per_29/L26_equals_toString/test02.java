package ClassWork.Lessons_20_per_29.L26_equals_toString;

public class test02 {
    public static void main(String[] args) {
        lion a = new lion();
    }

}

class animal {
    animal() {
        System.out.println("Constructor of animal");
    }

    static {
        System.out.println("Static init in animal");
    }

    {
        System.out.println("Non-static init in animal");
    }
}

class mammal extends animal {
    mammal() {
        System.out.println("Constructor of mammal");
    }

    static {
        System.out.println("Static init in mammal");
    }

    {
        System.out.println("Non-static init in mammal");
    }
}

class lion extends mammal {
    lion() {
        System.out.println("Constructor of lion");
    }

    static {
        System.out.println("Static init in lion");
    }

    {
        System.out.println("Non-static init in lion");
    }
}