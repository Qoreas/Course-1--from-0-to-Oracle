package ClassWork.Lessons_10_per_19.L_18_Array;


import java.util.Arrays;

public class class_Arrays_methods {
    public static void main(String[] args) {
        int array1[] = {1, 9, -3, 12, -22};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " - " + i);
        }
        System.out.println();

        Arrays.sort(array1); // sorting array

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " - " + i);
        }
        System.out.println();


        int index1 = Arrays.binarySearch(array1, 2); // search element in array - return int
        System.out.println(index1);

        System.out.println(array1);
    }
}
