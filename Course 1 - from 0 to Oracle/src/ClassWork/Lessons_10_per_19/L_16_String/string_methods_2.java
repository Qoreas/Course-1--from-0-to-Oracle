package ClassWork.Lessons_10_per_19.L_16_String;

public class string_methods_2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        System.out.println("������������ �������� ������� �");

        String s2 = s1.substring(3);
        System.out.println(s2);
        System.out.println(s1);

        
        System.out.println();
        System.out.println("������������ �������� ������� � � ��");

        String s3 = s1.substring(3, 7);
        System.out.println(s3);


        System.out.println();
        System.out.println("������� ������� �� �� �����");

        String s4 = s3.trim();
        System.out.println(s4);


        System.out.println();
        System.out.println("������������ �������� ������� � � ��");

        String s5 = s1.substring(3, 11);
        System.out.println(s5);


        System.out.println();
        System.out.println("������ �������");

        String s6 = s1.replace('a', 'Q');
        System.out.println(s6);


        System.out.println();
        System.out.println("������ ������");

        String s7 = s1.replace("abcd", "QWERTY");
        System.out.println(s7);


        System.out.println();
        System.out.println("�������� �����");
        String s9 = "privet";
        String s10 = "poka";

        System.out.println(s9.concat(s10));
    }
}
