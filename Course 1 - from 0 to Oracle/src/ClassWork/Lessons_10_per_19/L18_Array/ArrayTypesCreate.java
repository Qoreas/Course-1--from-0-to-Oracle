package ClassWork.Lessons_10_per_19.L18_Array;

public class ArrayTypesCreate {
    public static void main(String[] args) {

        // Declaration
        int[] a; // value == null - without capacity

        // Allocation
        a = new int[5]; // {0, 0, 0, 0, 0}


        String[] a2;
        a2 = new String[6]; // {null, null, null, null, null, null}

        int[][] a3;
        a3 = new int[2][2]; // {{0, 0}, {0, 0}}

        int[][] a4;         // if we have dif. 1d Array length, second [] IS EMPTY
        a4 = new int[3][];  // {{1, 2, 6, 43, 42}, {22}, {4,2,3}}


        // Initialization

        // Static init
        a2[0] = "Hello";
        a2[1] = "bye";
        a2[2] = "ok";

        a3[0][0] = 33;
        a3[1][1] = 321;

        a3[1] = a;
        System.out.println(a3[1][0]);


        // Dynamic init
        String[] cat1;
        int[][] cat2;

        cat1 = new String[3];
        cat2 = new int[3][];

        for (int i = 0; i < cat1.length; i++) {
            cat1[i] = "Hi - " + i;
            System.out.println(cat1[i]);
        }

        //                                 0        1   2
        cat2[0] = new int[5]; // {{0, 0, 0, 0, 0}, {}, {}}
        cat2[1] = new int[2];
        cat2[2] = new int[7];

        for (int i = 0; i < cat2.length; i++) {
            for (int j = 0; j < cat2[i].length; j++) {
                cat2[i][j] = i + j;
                System.out.print(cat2[i][j]);
            }
            System.out.println();
        }


        // Mixed creation option
        int[] tro = new int[3]; // length
        int[] tro2 = {1, 2, 3}; // value

        int[] b, w, c; // Array b, w, c

        int[] array = {1, 3, 4, 11222, 3};                                                                // int type
        String[] array2 = {"hi", "bwiw"};                                                                 // reference type
        int[][] array3 = {{0, 2, 3, 4}, {21, -332, 444}};                                                 // 2d type - Array in Array - like reference
        char[][][] array4 = {{{'a', 'b'}, {'c', 'd'}, {'e', 'f'}}, {{'g', 'h'}, {'j', 'i'}, {'w', 'q'}}}; // 3d type
    }
}
