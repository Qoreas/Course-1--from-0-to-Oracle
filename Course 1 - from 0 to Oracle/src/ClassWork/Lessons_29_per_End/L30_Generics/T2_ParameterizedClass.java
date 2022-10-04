package ClassWork.Lessons_29_per_End.L30_Generics;

public class T2_ParameterizedClass {
    public static void main(String[] args) {
        info<String> info1 = new info<>("Lol");
        System.out.println(info1);
        String s = info1.getValue();

        info<Integer> info2 = new info<>(3);
        System.out.println(info2);
        Integer i1 = info2.getValue();

    }
}

// <T> -- type
class info<T> {
    private T value;

    public info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{(" + value + ")}";
    }

    public T getValue() {
        return value;
    }
}