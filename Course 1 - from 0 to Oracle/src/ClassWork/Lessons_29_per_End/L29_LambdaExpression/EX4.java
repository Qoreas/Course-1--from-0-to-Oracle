package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

public class EX4 {
    static void def(inter ex) {
        System.out.println(ex.abc("privet"));
    }

    public static void main(String[] args) {
        def(x -> {
            x = "ok";
            return x.length();
        });
    }
}

interface inter {
    int abc(String st);
}