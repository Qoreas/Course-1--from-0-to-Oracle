package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class string_methods_4 {
    public static void main(String[] args) {

        System.out.println("��������� �������");
        String hi = "HELLO THERE";
        String s = hi.toLowerCase();
        System.out.println(s);


        System.out.println();
        System.out.println("������� �������");

        String hi2 = "hello there";
        String s2 = hi2.toUpperCase();
        System.out.println(s2);


        System.out.println();
        System.out.println("�������� ��");

        String hi3 = "hello there";
        boolean b = hi3.contains("ll");
        System.out.println(b);


        System.out.println();
        System.out.println("��������� �������: ������, ���");
        String s3 = "Hi";

        System.out.println(s3.isBlank());

        String s4 = "       ";

        System.out.println(s4.isBlank());


        System.out.println();
        System.out.println("������ ��");
        String s5 = "Hi";
        System.out.println(s5.isEmpty());

        System.out.println();
        System.out.println("�� ��, ��� � trim");
        String s6 = "   aaaa    ";
        System.out.println(s6.strip());

        System.out.println();
        System.out.println("�� ��, ��� � trim - �� � ������");
        String s7 = "   aaaa    ";
        System.out.println(s7.stripLeading());

        System.out.println();
        System.out.println("�� ��, ��� � trim - �� � �����");
        String s8 = "   aaaa    ";
        System.out.println(s8.stripTrailing());
    }
}
