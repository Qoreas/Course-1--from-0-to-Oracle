package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class search_for_up_case {
    public static void main(String[] args) {
        String text = "����� ����� ����� �������, ����� ������� ������. ��� ������ ������� ������� ��� ������ ��:" +
                " ����� �������, ��� ��� ������ ����. � ����� ���� ����, ��� ������ � ��� ������";

        String up = text.toUpperCase();

        char c1;
        char c2;

        for (int i = 0; i < text.length(); i++) {
            c1 = text.charAt(i);
            c2 = up.charAt(i);

            if (c1 != '.' && c1 != ',' && c1 != ' ' && c1 != ':' & c1 == c2) {
                System.out.println();
                System.out.println(c1);
                continue;
            }

            System.out.print(c1);
        }

    }
}
