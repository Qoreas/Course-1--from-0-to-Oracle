package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class methods {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("abcdefabc");

        // length - ����� - ���������� int
        int result1 = s1.length();
        System.out.println(result1 + " - ����� �����");


        // charAt - ����� ������� �� ������� - ���������� char
        char result2 = s1.charAt(0);
        System.out.println(result2 + " - ����� ������� �� �������");


        // indexOf - �� ����� ������� ��������� ������� - ���������� int
        int result3 = s1.indexOf("el");
        System.out.println(result3 + " - ��� ������� 'el'");

        int result4 = s1.indexOf("lo");
        System.out.println(result4 + " - ��� ������� 'lo'");

        int result5 = s1.indexOf('l');
        System.out.println(result5 + " - ��� char 'l'");

        // ����� ������� � ������ �������
        int result6 = s2.indexOf('a', 5);
        System.out.println(result6 + " - ��� ������ �������, � ������ �������");


        // startsWith - ���������� �� � ... - ���������� boolean
        boolean result7 = s2.startsWith("abc");
        System.out.println(result7 + " - ���������� ��");


        // endsWith - ������������� �� ... - ������������ boolean
        boolean result8 = s2.endsWith("abc");
        System.out.println(result8 + " - ������������� �� �� 'abc'");


        // subString - ���������� ������, ������� �/��� ���������� � ... - ���������� String
        String result9 = s2.substring(3);
        System.out.println(result9 + " - ������� �������� s2, ������� � 3 �������");

        String result10 = s2.substring(3, 7);
        System.out.println(result10 + " - ������� ��������, ������� � 3 ������� � ���������� 7�");


        // trim - strip - ������� ������� �� ����� - ���������� String
        String s3 = "   a  a  aa    ";
        String result11 = s3.trim();
        System.out.println(result11 + " - ����� ������� �� �����, �� �� ������");


        // replace - ������ ��� ��, �� ��� �� - ���������� String
        String result12 = s1.replace("Hel", "peeer");
        System.out.println(result12 + " - ������� ��� �� ��");


        // concat - ����� ��� ��, � ��� �� - ���������� String
        String result13 = s1.concat(s2);
        System.out.println(result13 + " - ����� ��� � ���");


        // toLowerCase - ������� �������� � ������ ������� - ���������� String
        String s4 = new String("WEDWDWRW");
        String result14 = s4.toLowerCase();
        System.out.println(result14 + " - �������� � ������ �������");

        // toUpperCase - ������� �������� � ������� ������� - ���������� String
        String s5 = new String("fiieuef");
        String result15 = s5.toUpperCase();
        System.out.println(result15 + " - �������� � ������� �������");


        // contains - �������� �� ... - ���������� boolean
        boolean r1 = s1.contains("Hel");
        System.out.println(r1 + " - �������� �� ������� 'Hel'");


        // isBlank - ������� �� �� �������� � ����� - ���������� boolean
        String r2 = "hi";
        String r3 = "    ";
        System.out.println(r2.isBlank() + " - ���� �� ������ ������� - " + r3.isBlank());


        // isEmpty - ���� �� - ���������� boolean
        boolean r4 = r2.isEmpty();
        String r5 = "";
        System.out.println(r4 + " - ������ �� - " + r5.isEmpty());


        // strip - ������� ������� �� ����� - ���������� String
        String r6 = " dddd  ";
        System.out.println(r6.strip() + " - ����� ������� � ����� ������");

        // stripLeading - ������� ������� � ������ - ���������� String
        System.out.println(r6.stripLeading() + " - ����� ������� � ������");

        // stripTrailing - ������� ������� � ����� - ���������� String
        System.out.println(r6.stripTrailing() + " - ����� ������� � �����");
    }
}

class method_chaining {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "uraaaaaaaaa";

        // ����� ������ Hello Worlduraaaa - ������� ������� - ������ uraa �� ���� -- Hello world����� - c w �� l -- worl
        String s3 = s1.concat(s2).trim().replace("uraaaaaaaaa", "��������").substring(6, 10);

        // Hello World - �� W �� ����� -- World
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}