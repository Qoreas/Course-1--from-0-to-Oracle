package HomeWork.Lessons_10_per_19.L17;

public class isEqual {
    // LINK EQUAL
    static boolean equal(StringBuilder obj1, StringBuilder obj2) {
        boolean result = false;

        if (obj1 == obj2) {
            result = true;
        }
        System.out.println(result);
        return result;
    }


    static boolean equalByValue(StringBuilder st1, StringBuilder st2) {
        boolean result = true;

        if (st1.length() == st2.length()) {
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) != st2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;

    }

    public static void main(String[] args) {
        StringBuilder hi = new StringBuilder("byd");
        StringBuilder bye = new StringBuilder("bye");

        System.out.println(equalByValue(hi, bye));
    }
}
