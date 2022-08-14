package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class dynamic_initialization_work_with_2_arrays {
    public static void main(String[] args) {
        int[] array1 = {3, 1, -2, 0};
        int[] array2 = {-9, 1, 5, 2};

        for (int i = 0; i < array1.length && i < array2.length; i++) {
            array1[i] = 12;
            array2[i] = 3;
        }
    }
}
