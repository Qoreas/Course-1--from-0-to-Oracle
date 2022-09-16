package ClassWork.Lessons_20_per_29.L25_Polimorphism;

public class T1 {
    public static void main(String[] args) {
        employee emp1 = new teacher();
        employee emp2 = new driver();
        employee emp3 = new doc();
        helpAble h = new teacher();

        emp1.work();
        emp2.work();
        emp3.work();

        h.help();
//        emp1.help();

        System.out.println("--------------");

        driver[] array1 = {new driver(), new driver()};
        helpAble[] array3 = {new driver(), new driver(), new teacher(), new doc()};

        employee[] array2 = {emp1, emp2, emp3};
        for (employee emp : array2) {
            emp.work();
        }

    }
}

abstract class employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class teacher extends employee implements helpAble {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class driver extends employee implements helpAble {
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class doc extends employee implements helpAble {
    @Override
    void work() {
        System.out.println("Doc works");
    }

    @Override
    public void help() {
        System.out.println("Doc helps");
    }
}

interface helpAble {
    void help();
}