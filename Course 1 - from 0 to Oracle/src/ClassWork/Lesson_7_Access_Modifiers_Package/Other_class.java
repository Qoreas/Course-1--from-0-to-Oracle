package ClassWork.Lesson_7_Access_Modifiers_Package;

public class Other_class {
    public static void main(String[] args) {
        Access_Public er = new Access_Public(333);
        System.out.println(er.salary);
        er.salDob();
    }
}
