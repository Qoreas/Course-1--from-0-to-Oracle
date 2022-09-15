package ClassWork.Lessons_1_per_9.L7_AccessModifiersPackage;

public class AccessPublic {
    // public
    public double salary;
     public AccessPublic(double salarySet) {
        salary = salarySet;
    }

     public void salDob() {
         double result = salary * 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        AccessPublic ac = new AccessPublic(22);
        System.out.println(ac.salary);
        ac.salDob();
    }
}

class AccessTypesTest {
    public static void main(String[] args) {
        AccessPublic ac = new AccessPublic(22);
        System.out.println(ac.salary);
        ac.salDob();
    }
}