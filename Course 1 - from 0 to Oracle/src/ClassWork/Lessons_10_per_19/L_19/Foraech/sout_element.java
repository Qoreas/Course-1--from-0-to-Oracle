package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class sout_element {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9};

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//        or

        for (int a : array) { // variable a ALWAYS array's datatype
            System.out.println(a);
        }
    }
}
