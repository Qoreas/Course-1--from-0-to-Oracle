package ClassWork.Lessons_10_per_19.L19.Foraech;

public class soutElement {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};

//        for (int i = 0; i < Array.length; i++) {
//            System.out.print(Array[i]);
//        }
//        or

        for (int a : array) { // variable a ALWAYS Array's datatype
            System.out.println(a);
        }
    }
}
