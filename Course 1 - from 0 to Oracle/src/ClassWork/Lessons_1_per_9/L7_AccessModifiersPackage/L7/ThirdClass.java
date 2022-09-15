package ClassWork.Lessons_1_per_9.L7_AccessModifiersPackage.L7;


import ClassWork.Lessons_1_per_9.L7_AccessModifiersPackage.AccessPublic;

public class ThirdClass {
    public static void main(String[] args) {
        AccessPublic ea = new AccessPublic(33);
        System.out.println(ea.salary);
        ea.salDob();
    }
}
