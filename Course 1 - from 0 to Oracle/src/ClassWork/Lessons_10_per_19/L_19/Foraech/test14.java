package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class test14 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {2, 1}, {9, -5, 28, 2, 4, 333}};

        for (int[] array2 : array) {
            for (int i : array2) {
                System.out.print(i + " ");
            }
        }
    }
}
