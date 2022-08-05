package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class test2_concatenation {
}

class employee8 {
    double salary;
    boolean isManager;

    employee8(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }

    public static void main(String[] args) {
        employee8 emp = new employee8(100, false);
        System.out.println("Он менеджер? " + emp.isManager + ". Его зп: " + emp.salary);
    }
}

class test4 {
    public static void main(String[] args) {
        String s = null;
        s += "ok";
        System.out.println(s);
    }
}