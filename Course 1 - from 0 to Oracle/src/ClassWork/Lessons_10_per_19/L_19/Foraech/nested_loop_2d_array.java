package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class nested_loop_2d_array {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 5}, {6, 2}, {7, 8, 9}};

        for (int[] main : array) {
            for (int inner : main) {
                System.out.print(inner + " ");
            }
        }


    }
}
