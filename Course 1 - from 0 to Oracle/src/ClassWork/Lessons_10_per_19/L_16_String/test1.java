package ClassWork.Lessons_10_per_19.L_16_String;

public class test1 {

}

class Employee6 {
    double salary;
    boolean isManager = false;

    Employee6(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class Employee6_test {
    public static void main(String[] args) {
        Employee6 emp = new Employee6(100, true);
        System.out.println("Is he manager? " + emp.isManager + ". His salary is " + emp.salary);
    }
}