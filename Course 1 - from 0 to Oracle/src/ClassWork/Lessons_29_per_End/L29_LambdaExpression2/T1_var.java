package ClassWork.Lessons_29_per_End.L29_LambdaExpression2;

import java.util.ArrayList;

public class T1_var {

    public static void main(String[] args) {
        var tit = new testInferenceType();
        var i = 10; // int
        var w = 1.2F; // float
        var array = new String[]{"q", "b"};
        var result = abc();
        Object obj1 = "hi";
        var obj2 = obj1;

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Hello");
        for (var s : ar) {
            System.out.println(s);
        }

        var array2 = new int[]{1, 2, 4};

        var var = "var";

    }

    static double abc() {
        return 3.14;
    }
}

class testInferenceType {
}