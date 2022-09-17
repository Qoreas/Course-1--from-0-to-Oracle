package ClassWork.Lessons_20_per_29.L21_RepeatLesson.PrimitiveReferenceOverload;

public class EX1 {
    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(Boolean b) {
        System.out.println(b);
    }

    public StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder("Bye");
    }
}
