package ClassWork.Lessons_10_per_19.L_16_String;

public class string_methods_2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        System.out.println("Присваивание значения начиная с");

        String s2 = s1.substring(3);
        System.out.println(s2);
        System.out.println(s1);

        
        System.out.println();
        System.out.println("Присваивание значения начиная с и до");

        String s3 = s1.substring(3, 7);
        System.out.println(s3);


        System.out.println();
        System.out.println("убирает пробелы по по бокам");

        String s4 = s3.trim();
        System.out.println(s4);


        System.out.println();
        System.out.println("Присваивание значения начиная с и до");

        String s5 = s1.substring(3, 11);
        System.out.println(s5);


        System.out.println();
        System.out.println("замена символа");

        String s6 = s1.replace('a', 'Q');
        System.out.println(s6);


        System.out.println();
        System.out.println("замена строки");

        String s7 = s1.replace("abcd", "QWERTY");
        System.out.println(s7);


        System.out.println();
        System.out.println("Сложение строк");
        String s9 = "privet";
        String s10 = "poka";

        System.out.println(s9.concat(s10));
    }
}
