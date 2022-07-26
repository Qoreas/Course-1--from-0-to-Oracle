package ClassWork.Lesson_7_Access_Modifiers_Package;

public class Access_Public {
    // public
     double salary;
     Access_Public(double salarySet) {
        salary = salarySet;
    }

     void salDob() {
         double result = salary * 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Access_Public ac = new Access_Public(22);
        System.out.println(ac.salary);
        ac.salDob();
    }
}

class Access_types_test {
    public static void main(String[] args) {
        Access_Public ac = new Access_Public(22);
        System.out.println(ac.salary);
        ac.salDob();
    }
}