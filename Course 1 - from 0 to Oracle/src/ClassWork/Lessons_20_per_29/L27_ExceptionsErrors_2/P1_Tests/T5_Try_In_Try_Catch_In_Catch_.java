package ClassWork.Lessons_20_per_29.L27_ExceptionsErrors_2.P1_Tests;

public class T5_Try_In_Try_Catch_In_Catch_ {
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
        T5_Try_In_Try_Catch_In_Catch_ t = new T5_Try_In_Try_Catch_In_Catch_();
        t.abc();
    }
}
