package Tests.OGE;

public class rounder {
    public static void main(String[] args) {
        int[] speed = {4, 74, 69, 63, 66};

        // ��� ���� ���������� ��������
        ROUNDER:
        for (int i = 0; i < speed.length; i++) {
            int remainder = speed[i] % 10;
            if (speed[i] % 10 < 5) {
                speed[i] = speed[i] - remainder;
            } else {
                speed[i] = speed[i] - remainder + 10;
            }
        }
    }
}
