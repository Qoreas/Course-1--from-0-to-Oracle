package ClassWork.Lessons_20_per_29.L21_RepeatLesson.GarbageCollection;

public class    EX1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("Hello");
        s2 = new String("Bye");
        s1 = s2; // deleting "Hello"
        String s3 = s1;
        s1 = null;

        System.gc();
    }
}
