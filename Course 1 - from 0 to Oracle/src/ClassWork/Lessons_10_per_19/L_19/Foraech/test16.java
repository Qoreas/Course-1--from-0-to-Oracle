package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class test16 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int b : array) {
            b = 10;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
