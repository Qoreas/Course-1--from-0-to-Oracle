package Fun.OGE;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1001];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30_000);
        }

        for (int num : array) {
            if (num % 3 == 0 && num % 10 == 2) {
                System.out.println(num);
            }
        }
    }
}
