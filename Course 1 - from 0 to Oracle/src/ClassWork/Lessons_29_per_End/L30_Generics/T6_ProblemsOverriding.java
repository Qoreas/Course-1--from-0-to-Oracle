package ClassWork.Lessons_29_per_End.L30_Generics;

public class T6_ProblemsOverriding {
}

class parent {
    public void abc(info2<String> info2) {
        String s = info2.getValue();
    }
}

class child extends parent {
//    public void abc(info2<Integer> info2) {
//        Integer i = info2.getValue();
//    }
}