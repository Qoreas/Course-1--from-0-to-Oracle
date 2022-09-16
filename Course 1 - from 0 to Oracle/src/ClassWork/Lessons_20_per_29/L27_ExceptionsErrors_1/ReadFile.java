package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\ClassHierarchy.txt");
            System.out.println("The Object file was created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("The Flow was created");
            int counter = 0;

            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("information is reading: " + counter);
                if (counter == 3) {
                    fis.close();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("this is finally block");
            System.out.println(result);
        }
    }
}
