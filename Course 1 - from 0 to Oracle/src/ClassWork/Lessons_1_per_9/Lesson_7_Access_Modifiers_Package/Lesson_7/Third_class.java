package ClassWork.Lessons_1_per_9.Lesson_7_Access_Modifiers_Package.Lesson_7;


import ClassWork.Lessons_1_per_9.Lesson_7_Access_Modifiers_Package.Access_Public;

public class Third_class {
    public static void main(String[] args) {
        Access_Public ea = new Access_Public(33);
        System.out.println(ea.salary);
        ea.salDob();
    }
}
