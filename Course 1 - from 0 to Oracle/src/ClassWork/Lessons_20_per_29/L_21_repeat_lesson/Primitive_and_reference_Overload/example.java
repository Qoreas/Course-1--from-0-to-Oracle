package ClassWork.Lessons_20_per_29.L_21_repeat_lesson.Primitive_and_reference_Overload;

public class example {
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
