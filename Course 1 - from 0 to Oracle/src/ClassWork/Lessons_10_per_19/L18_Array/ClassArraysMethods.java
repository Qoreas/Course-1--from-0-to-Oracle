package ClassWork.Lessons_10_per_19.L18_Array;


import java.util.Arrays;

public class ClassArraysMethods {
    public static void main(String[] args) {
        int array1[] = {1, 9, -3, 12, -22};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " - " + i);
        }
        System.out.println();

        Arrays.sort(array1); // sorting Array

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " - " + i);
        }
        System.out.println();


        int index1 = Arrays.binarySearch(array1, 2); // search element in Array - return int
        System.out.println(index1);

        System.out.println(array1);
    }
}
