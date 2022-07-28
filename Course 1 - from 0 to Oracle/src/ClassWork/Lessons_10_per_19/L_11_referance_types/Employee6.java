package ClassWork.Lessons_10_per_19.L_11_referance_types;

public class Employee6 {
    public String name; public double salary;

    Employee6(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double upSalary(double count) {
        count *= 2;
        return count;
    }

    public double salaryTwo() {
        salary *= 2;
        return salary;
    }
}

class Employee6_test {
    public static void main(String[] args) {
        Employee6 test = new Employee6("Sasha", 1000.55);
        double d = test.upSalary(test.salary);
        System.out.println(d);

        System.out.println(test.salary);

        test.salaryTwo();
        System.out.println(test.salary);
    }
}