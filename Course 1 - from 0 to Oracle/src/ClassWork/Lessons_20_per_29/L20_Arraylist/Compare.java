package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'i', 'v', 'k', 'a'};

        System.out.println(Arrays.compare(array3, array4));

        System.out.println(Arrays.mismatch(array3, array4));
    }
}
