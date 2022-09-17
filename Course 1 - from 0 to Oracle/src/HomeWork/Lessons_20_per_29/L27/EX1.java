package HomeWork.Lessons_20_per_29.L27;

public class EX1 {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class notMeatException extends RuntimeException {
    notMeatException(String s) {
        super(s);
    }
}

class notWaterException extends Exception {
    notWaterException(String s) {
        super(s);
    }
}


class tiger {
    void eat(String s) {
        if (!s.equals("meat")) {
            throw new notMeatException("Tiger doesn't eat " + s);
        }

        if (s.equals("meat")) {
            System.out.println("Tiger eats meat");
        }
    }

    // here you need to write that the drink class can throw such an exception notWaterException
    // because the boss of this exception is Exception - which dictates the rules for dealing with it
    // when working with the notMeatException class, we do not write this because his dad is an exception
    // which exits during program startup while dad notWaterException
    // appears at the program check level - i.e. before launch
    void drink(String s) throws notWaterException {

        if (!s.equals("water")) {
            throw new notWaterException("Tiger doesn't drink " + s);
        }

        if (s.equals("water")) {
            System.out.println("Tiger drinks water");
        }
    }
}