package HomeWork.Lessons_10_per_19.L_19;

public class ex1 {
    static String[] abc(String[]... array) {

        int length = 0;
        for (String[] i : array) {
            length += i.length;
        }

        String[] result = new String[length];
        int count = 0;
        for (String[] main : array) {
            for (String item : main) {
                result[count] = item;
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] ar1 = {"Hello", "hi"};
        String[] ar2 = {"Bye", "yee"};

        String[] result = abc(ar1, ar2);

        for (String a : args) {
            for (int i = 0; i < result.length; i++) {
                if (a.equals(result[i])) {
                    result[i] = null;
                }
            }
        }

        for (String n : result) {
            System.out.print(n + "  ");
        }

    }
}
