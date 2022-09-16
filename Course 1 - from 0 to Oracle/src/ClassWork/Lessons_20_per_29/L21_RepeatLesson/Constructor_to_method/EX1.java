package ClassWork.Lessons_20_per_29.L21_RepeatLesson.Constructor_to_method;

public class EX1 {
    EX1() {
        System.out.println("This is constructor");
    }

    void example() {
        System.out.println("This is method");
    }

    int example = 3;
}

class T1 {
    public static void main(String[] args) {
        EX1 ex = new EX1();
    }
}
