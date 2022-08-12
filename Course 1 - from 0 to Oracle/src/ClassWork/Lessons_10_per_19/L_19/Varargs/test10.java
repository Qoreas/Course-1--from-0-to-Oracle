package ClassWork.Lessons_10_per_19.L_19.Varargs;

public class test10 {
    static void sum(int ... a) { // like array - varargs always last
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            System.out.println(sum);
        }
    }

    public void abc(int[] ... a) {

    }

    public static void main(String[] args) {
        sum(1, 3);
    }
}
