package ClassWork.Lessons_10_per_19.L19.Foraech;

public class sumElements {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int a : array) {
            sum += a;
        }

        System.out.println(sum);
    }
}
