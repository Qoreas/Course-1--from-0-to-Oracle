package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class test17 {
    public static void main(String[] args) {
        int[] array1 = {3, 1, -2, 0};
        int[] array2 = {-1, 0, 9};

        for (int i = 0; i < array1.length && i < array2.length; i++) {
            array1[i] = 12;
            array2[i] = 3;
        }
    }
}
