package ClassWork.Lessons_1_per_9.L_9_Scope_Variables;

public class Student4 {
    public int d = 4;
    public double b = 3.3;
    public static int A = 3;
}

class Student4_test {
    public static void main(String[] args) {
        Student4 test = new Student4();
        Student4 test2 = new Student4();
        Student4 test3;

        test = null;
    }
}