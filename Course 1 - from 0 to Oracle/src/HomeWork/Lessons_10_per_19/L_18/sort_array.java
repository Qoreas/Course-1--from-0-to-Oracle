package HomeWork.Lessons_10_per_19.L_18;

import java.util.Arrays;


public class sort_array {
    static void sortArray(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void main(String[] args) {
        int[] ar = {2, 333, -221, 4, -4, 10};

        sortArray(ar);
    }
}
