package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P4_Exceptions;

import java.io.IOException;

public class EXC22_methods_override {
    public static void main(String[] args) {
        animal a = new mouse();
        try {
            a.run();

        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}

class animal {
    void run() throws IOException {
        System.out.println("Animal is running");
    }

    void run(int a) throws Exception {
        System.out.println("Animal is running");
    }
}

class mouse extends animal {
    void run() {
        System.out.println("Mouse is running");
    }
}