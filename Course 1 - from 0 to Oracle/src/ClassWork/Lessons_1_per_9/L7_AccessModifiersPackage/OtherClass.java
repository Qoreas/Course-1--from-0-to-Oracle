package ClassWork.Lessons_1_per_9.L7_AccessModifiersPackage;

public class OtherClass {
    public static void main(String[] args) {
        AccessPublic er = new AccessPublic(333);
        System.out.println(er.salary);
        er.salDob();
    }
}
