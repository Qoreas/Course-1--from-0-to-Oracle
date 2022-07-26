package ClassWork.Lesson_10_import;
import ClassWork.Lesson_9_Scope_Variables.*;

public class B {

    public static void main(String[] args) {
        Student4 st = new Student4();
        System.out.println(st.b);
        System.out.println(st.d);
        System.out.println(Student4.A);
    }
}

class C {
    Student4 bd = new Student4();
}