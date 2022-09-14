package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2.P2_RunTimeExceptions;

public class EXC13_illegalStateException {
    public static void main(String[] args) {
        plane p = new plane();
        p.waiting();
        p.flying();
        p.flightCancel();
    }
}

class plane {
    String planeStatus = "Waiting"; // Waiting, Flying, The flight canceled

    public void flying() {
        planeStatus = "Flying";
        System.out.println("Plane in air");
    }

    public void waiting() {
        if (planeStatus.equals("Flying")) {
            throw new IllegalStateException("The plane already in air");
        }
        planeStatus = "Waiting";
        System.out.println("Plane is waiting for flight");
    }

    public void flightCancel() {
        if (planeStatus.equals("Flying")) {
            throw new IllegalStateException("the plane already in air");
        }
        planeStatus = "The flight canceled";
        System.out.println("The flight canceled");
    }
}