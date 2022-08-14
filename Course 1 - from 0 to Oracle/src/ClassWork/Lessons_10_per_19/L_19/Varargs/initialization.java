package ClassWork.Lessons_10_per_19.L_19.Varargs;

public class initialization {
//    static void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    static void sum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//    or

    static void sum(int ... a) { // like int[] array
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(3, 4);
    }
}
