package Tests.OGE;

public class EX2 {
    public static void main(String[] args) {
        //wtf

        // 4, 74, 69, 63, 66
        // 3, 50, 81, 65
        // 1, 30
        // 2, 13, 52
        int[] speed = {3, 50, 81, 65};
        int max = 0;
        boolean is30 = false;

        for (int i : speed) {
            if (max < i) {
                max = i;
                System.out.println("Max speed now is: " + max);
            }

            if (i < 30) {
                is30 = true;
            }

        }

        if (is30 == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
