package ClassWork.Lessons_10_per_19.L18_Array;

public class Exceptions {
    static String s;

    public static void main(String[] args) {
        // int[] Array = new int[-3];           - NegativeArraySizeException

        int[] array2 = new int[]{1, 3, 4};
        // array2[3] = 4;                       - ArrayIndexOutOfBoundsException

        int[][] array3 = new int[3][];
        // System.out.println(array3[0][1]);    - NullPointerException

        // s.length();                          - NullPointerException
        

    }
}
