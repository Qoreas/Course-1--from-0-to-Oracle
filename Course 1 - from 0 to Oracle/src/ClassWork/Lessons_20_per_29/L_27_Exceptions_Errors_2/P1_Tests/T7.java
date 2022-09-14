package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.P1_Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_2\\T3.java");
            System.out.println("File is in the system and founded");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("We have problems with stream");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException was found");
        }
    }
}
