package HomeWork.Lessons_29_per_End.L30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class employee {
    String name;
    String department;
    double salary;

    employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class testEmployee {
    static void printEmployee(employee emp) {
        System.out.println("Employee name: " + emp.name + ". Department: " + emp.department + ". Salary: " + emp.salary);
    }

    static void filterEmployee(ArrayList<employee> list, Predicate<employee> predicate) {
        int counter = 1;
        for (employee emp : list) {
            if (predicate.test(emp)) {
                System.out.print(counter + ") ");
                printEmployee(emp);
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<employee> list1 = new ArrayList<>();

        employee emp1 = new employee("Petr", "IT", 300);
        employee emp2 = new employee("Erefan", "INFO", 450);
        employee emp3 = new employee("Sasha", "INFO", 19000);
        employee emp4 = new employee("Elifant", "IT", 150);
        employee emp5 = new employee("Ivan", "IT", 240);
        employee emp6 = new employee("Extra", "COFFEE", 20000);
        employee emp7 = new employee("Extra", "Extra", 46);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        list1.add(emp5);
        list1.add(emp6);
        list1.add(emp7);

        filterEmployee(list1, emp -> emp.department.equals("IT") && emp.salary > 200);
        filterEmployee(list1,emp -> emp.name.startsWith("E") && emp.salary != 450);
        filterEmployee(list1,emp -> emp.name.equals(emp.department));
    }
}