package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\java_io\\testing_io.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1 was founded");
        } catch (IOException e) {
            System.out.println("Exception 3 was founded");
        } catch (NullPointerException e) {
            System.out.println("Exception 2 was founded");
        } catch (RuntimeException e) {
            System.out.println("Exception 4 was founded");
        } catch (Exception e) {
            System.out.println("Exception 5 was founded");
        } catch (Throwable e) {
            System.out.println("Exception 6 was founded");
        }
    }
}
