package HomeWork.Lessons_10_per_19.L_19;

public class ex1 {
    static void abc(String[] ... array) {

        String result = "";

        for (String[] main : array) {
            for (String s : main) {
                result += s + ", ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            args[i] = null;
        }

        String[] ar1 = {"Hello", "hi"};
        String[] ar2 = {"Bye", "yee"};

        abc(ar1, ar2);

        for (String i : args) {
            System.out.println(i);
        }
    }
}
