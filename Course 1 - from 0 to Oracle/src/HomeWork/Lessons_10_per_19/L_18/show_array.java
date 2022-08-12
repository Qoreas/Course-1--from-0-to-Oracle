package HomeWork.Lessons_10_per_19.L_18;

public class show_array {
    static void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ' ');

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] ar1 = {{"Hello", "Boy"}, {"Android"}, {"Bye", "Girl"}};

        showArray(ar1);
    }
}
