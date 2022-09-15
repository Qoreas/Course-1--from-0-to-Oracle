package ClassWork.Lessons_20_per_29.L23_OverridingHidingFinal.Binding;

public class test08 {
    void abc(animal animal) {
        System.out.println("A");
    }

    void abc(mouse mouse) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        test08 t = new test08();
        animal an = new mouse();
        an.getName();
    }
}

class animal {
    void getName() {
        System.out.println("Animal");
    }
}

class mouse extends animal {
    void getName() {
        System.out.println("Mouse");
    }
}
