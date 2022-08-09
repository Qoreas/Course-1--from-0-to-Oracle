package ClassWork.Lessons_10_per_19.L_18_Array;

public class task1 {
    static void minMax(double[] array) {

        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min + " max: " + max);
    }

    public static void main(String[] args) {
        double[] ar = {1, 423, 332, 2211, -21, -3};
        minMax(ar);

        minMax(new double[]{1, 2, 3});
    }
}
