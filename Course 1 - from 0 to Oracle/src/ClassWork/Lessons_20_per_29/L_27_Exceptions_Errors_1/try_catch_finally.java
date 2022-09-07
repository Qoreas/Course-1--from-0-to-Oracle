package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class try_catch_finally {

    void abc() throws FileNotFoundException {
        File file = new File("C:\\Users\\Qreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\java_io\\testing_io.txt");
        FileInputStream fis = new FileInputStream(file);
    }

    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) {
        // exception to search
//         catch (IOException e) {
//            System.out.println("Can not be read");
//        } finally {
//            System.out.println("This is finally block");
//        }
        try_catch_finally t = new try_catch_finally();

        try {
            t.def();
        } catch (FileNotFoundException e) {
            IOException f = e;
            System.out.println("Exception was caught");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
