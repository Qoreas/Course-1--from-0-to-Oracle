package ClassWork.Lessons_20_per_29.L_27_Exceptions_Errors_2;

public class Try_In_Try_Catch_In_Catch_5 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length());
            } catch (NullPointerException e2) {
                System.out.println("This is inner catch block");
            }
        } catch (NullPointerException e) {
            System.out.println("Exception NullPointerException is found");
        }
    }

    public static void main(String[] args) {
        Try_In_Try_Catch_In_Catch_5 t = new Try_In_Try_Catch_In_Catch_5();
        t.abc();
    }
}
