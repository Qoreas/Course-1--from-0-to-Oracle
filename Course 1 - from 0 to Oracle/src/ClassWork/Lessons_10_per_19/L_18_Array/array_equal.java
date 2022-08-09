package ClassWork.Lessons_10_per_19.L_18_Array;

public class array_equal {
    public static void main(String[] args) {
        int[] array1 = {1, 9, -3, 12, -22};
        int[] array2 = {1, 9, -3, 12, -22};
        int[] array3 = array2;

        System.out.println(array3 == array2);
        System.out.println(array1.equals(array2));
        array1[1] = 0;
        array2[5 - 3] = 3;
        array1[array1.length] = 10; // error
    }
}
