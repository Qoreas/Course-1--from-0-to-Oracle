package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class string_methods_1 {

    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        System.out.println("Длина");

        int count = s1.length(); // длина
        System.out.println(count);


        System.out.println("Поиск по индексу");

        char c1 = s1.charAt(1); // поиск по индексу
        System.out.println(c1);


        System.out.println("Поиск по символу");

        int i1 = s1.indexOf("l");
        System.out.println(i1);


        System.out.println("Поиск по символу/ам");

        int i2 = s1.indexOf("d");
        System.out.println(i2);


        System.out.println("Поиск по символу/ам с какого индекса");

        int i3 = s1.indexOf("cd", 5);
        System.out.println(i3);


        System.out.println("Начинается ли");

        boolean b1 = s1.startsWith("abc", 7);
        System.out.println(b1);


        System.out.println("Заканчивается ли");

        boolean b2 = s1.endsWith("cd");
        System.out.println(b2);
    }
}
