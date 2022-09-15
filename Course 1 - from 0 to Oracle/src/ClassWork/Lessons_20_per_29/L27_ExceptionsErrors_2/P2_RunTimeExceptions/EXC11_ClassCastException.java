package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P2_RunTimeExceptions;

public class EXC11_ClassCastException {
    public static void main(String[] args) {
        doc d = new doc();
        teacher t = new teacher();
        teacher t3 = new teacher();

        teacher[] array2 = {t, t3};
        employee[] array = {d, t};

        // exception -- 0 is doc
        teacher t2 = (teacher) array[0];

//        doc d2 = (doc) array2[0];

    }
}

class employee {
}

class doc extends employee {
}

class teacher extends employee {
}
