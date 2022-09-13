package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2;

public class our_exception_8 {
    void marathon(int C, int kmPerHour) throws legDownException {
        if (kmPerHour > 12) {
            throw new legDownException("Temp was too high: " + kmPerHour);
        }

        if (C >= 32) {
            //runTimeException don't need throws
            throw new legAffectException();
        }

        System.out.println("You complete marathon");
    }

    public static void main(String[] args) {
        our_exception_8 t = new our_exception_8();
        try {
            t.marathon(20, 13);
        } catch (legDownException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In any case you will get reward");
        }
    }
}


class legDownException extends Exception {
    legDownException(String m) {
        super(m);
    }

    legDownException() {
    }
}

class legAffectException extends RuntimeException {
    legAffectException(String m) {
        super(m);
    }

    legAffectException() {
    }
}
