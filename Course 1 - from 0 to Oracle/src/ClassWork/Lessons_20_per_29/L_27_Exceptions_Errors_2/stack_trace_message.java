package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class stack_trace_message {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\oreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\class_hierarchy.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
