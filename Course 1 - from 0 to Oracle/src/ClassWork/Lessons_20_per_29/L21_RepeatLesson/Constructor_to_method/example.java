package ClassWork.Lessons_20_per_29.L21_RepeatLesson.Constructor_to_method;

public class example {
    example() {
        System.out.println("This is constructor");
    }

    void example() {
        System.out.println("This is method");
    }

    int example = 3;
}

class test{
    public static void main(String[] args) {
        example ex = new example();
    }
}
