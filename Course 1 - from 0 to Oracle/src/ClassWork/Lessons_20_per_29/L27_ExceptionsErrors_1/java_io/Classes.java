package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_1.java_io;
import java.io.*;

public class Classes {
    public static void main(String[] args) throws Exception {
        // abstract representation -- search file path
        File f = new File("C:\\Users\\Qoreas\\IdeaProjects\\Study\\Course 1 - from 0 to Oracle\\src\\ClassWork\\Lessons_20_per_29\\L_27_Exceptions_Errors_1\\java_io\\Testing_io.txt");
        FileInputStream fis = new FileInputStream(f);
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);



    }
}
