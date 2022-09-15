package ClassWork.Lessons_20_per_29.L21_RepeatLesson.Return;

public class example1 {
    int abc() {
        return 5;
    }

    int abc2(int a) { // return not at end
        if (a < 10) {
            return 6;
        } else {
            return 10;
        }
    }

    void abc3(int a2) {
        if (a2 > 3) {
            return;
        }
        System.out.println("hello");
        return;

    }

    public static void main(String[] args) {
        int a = new example1().abc();
        new example1().abc();
    }
}
