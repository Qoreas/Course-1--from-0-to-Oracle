package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class nested_TryCatchFinally_4 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\class_hierarchy.txt");
            try {
                fis2 = new FileInputStream("C:\\Users\\Qoeas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\class_hierarchy.txt");

            } catch (FileNotFoundException e2) {
                System.out.println("File not found - fis2");
            }
        } catch (FileNotFoundException e2) {
            System.out.println("File not found - fis1");
        } finally {
            System.out.println("This is outer finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Exception is found in finally block");
            }
        }
    }

    public static void main(String[] args) {
        nested_TryCatchFinally_4 t = new nested_TryCatchFinally_4();
        t.abc();
    }
}
