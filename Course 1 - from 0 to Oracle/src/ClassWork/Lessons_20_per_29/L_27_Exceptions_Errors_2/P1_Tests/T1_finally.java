package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.P1_Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T1_finally {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("hi");
        try {
            File f = new File("C:\\Uers\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\class_hierarchy.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception is found");
            System.out.println("Variable a in catch block = " + a);
            return a;
        } finally {
            a.append("!!!!");
            System.out.println("This is finally block");
            System.out.println("Variable a in finally block = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
