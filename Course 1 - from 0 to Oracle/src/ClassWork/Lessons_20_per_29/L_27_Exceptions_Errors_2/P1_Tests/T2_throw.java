package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.P1_Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_throw {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("C:\\Uers\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\class_hierarchy.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception is found");
            throw e;
        } finally {
            System.out.println("This is finally block");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception is found");
        }


    }
    // runtime exception
//    void def() {
//        try {
//            int[] ar = {1, 3, 4};
//            System.out.println(ar[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception is found");
//            throw e;
//        } finally {
//            System.out.println("This is finally block");
//        }
//    }
}
