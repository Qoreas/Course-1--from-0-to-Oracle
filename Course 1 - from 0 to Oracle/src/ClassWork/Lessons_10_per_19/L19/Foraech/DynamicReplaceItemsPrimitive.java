package ClassWork.Lessons_10_per_19.L19.Foraech;

public class DynamicReplaceItemsPrimitive {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};

//        for (int i = 0; i < Array.length; i++) {
//            Array[i] = 29;
//            System.out.print(Array[i] + " ");
//        }

        for (int a : array) {
            a = 3;
        }
        // there won't be replacing
        for (int i : array) {System.out.println(i);}
    }
}
