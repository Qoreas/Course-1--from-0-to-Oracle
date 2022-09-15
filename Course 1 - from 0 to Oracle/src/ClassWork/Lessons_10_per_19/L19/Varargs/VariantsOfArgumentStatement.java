package ClassWork.Lessons_10_per_19.L19.Varargs;

public class VariantsOfArgumentStatement {
    static void sum(String s, int ... a) { // varargs only one - varargs always last
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }

    public void abc(int[] ... array) {} // more arrays

    public static void main(String[] args) {
//        sum("hi",3, 4);
//        sum("Bye", new int[]{1, 2, 3});

    }
}
