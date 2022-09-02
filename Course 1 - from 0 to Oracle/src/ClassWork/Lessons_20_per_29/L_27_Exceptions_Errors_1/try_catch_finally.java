package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class try_catch_finally {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\java_io\\testing_io.txt");

        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Have a good day");
        }
        // exception to search
        catch (FileNotFoundException e) {
            System.out.println("We caught the exception at - " + e);
        } finally {
            System.out.println("This is finally block");
        }

        System.out.println("another code");

    }
}
