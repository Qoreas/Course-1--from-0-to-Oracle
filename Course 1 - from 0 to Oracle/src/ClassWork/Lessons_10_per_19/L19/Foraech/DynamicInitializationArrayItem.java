package ClassWork.Lessons_10_per_19.L19.Foraech;

public class DynamicInitializationArrayItem {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int b : array) { // we cant do it by foreach loop
            b = 10;
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
