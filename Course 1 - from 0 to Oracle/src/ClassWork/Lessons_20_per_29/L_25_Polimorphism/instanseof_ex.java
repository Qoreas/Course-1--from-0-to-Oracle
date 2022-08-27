package ClassWork.Lessons_20_per_29.L_25_Polimorphism;

public class instanseof_ex {
    public static void main(String[] args) {
        employee1 emp1 = new teacher1();
        employee1 emp2 = new driver1();
        employee1 emp3 = new doc1();
        helpAble h = new teacher();
        String s1 = null;

        employee1[] array2 = {emp1, emp2, emp3};

        System.out.println(emp1 instanceof teacher1); // is emp1 has type teacher/employee
        System.out.println(s1 instanceof String);
        System.out.println(array2 instanceof Object);
    }

}

abstract class employee1 {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class teacher1 extends employee1 implements helpAble {
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class driver1 extends employee1 implements helpAble {
    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class doc1 extends employee1 implements helpAble {
    @Override
    void work() {
        System.out.println("Doc works");
    }

    @Override
    public void help() {
        System.out.println("Doc helps");
    }
}

interface helpAble1 {
    void help();
}