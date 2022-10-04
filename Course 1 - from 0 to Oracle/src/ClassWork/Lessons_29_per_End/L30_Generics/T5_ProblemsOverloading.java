package ClassWork.Lessons_29_per_End.L30_Generics;

public class T5_ProblemsOverloading {
    public static void main(String[] args) {
        info2<String> info1 = new info2<>("Lol");
        System.out.println(info1);
        String s = info1.getValue();

        info2<Integer> info2 = new info2<>(3);
        System.out.println(info2);
        Integer i1 = info2.getValue();

    }

//    public void abc(info2<String> info2) {
//        String s = info2.getValue();
//    }
//
//    public void abc(info2<Integer> info2) {
//        Integer s = info2.getValue();
//    }
}

// <T> -- type
class info2<T> {
    private T value;

    public info2(T value) {
        this.value = value;
    }

    public String toString() {
        return "{(" + value + ")}";
    }

    public T getValue() {
        return value;
    }
}
