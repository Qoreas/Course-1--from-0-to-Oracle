package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P4_Exceptions;

import java.io.FileNotFoundException;

public class EXC23_constructor {
    public static void main(String[] args) {
//        try {
//            animal1 t = new mouse1();
//        } catch (Exception e) {
//        }


    }
}

class animal1 {
    animal1() throws FileNotFoundException, IndexOutOfBoundsException {
    }
}

class mouse1 extends animal1 {  // etc
    mouse1() throws Exception {
        super();
    }
}

class human1 {
    String name;
    int age;

    human1(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Not correct age");
        }

        this.name = name;
        this.age = age;
    }
}










