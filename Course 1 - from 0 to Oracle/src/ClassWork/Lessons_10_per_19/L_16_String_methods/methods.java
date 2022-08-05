package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class methods {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("abcdefabc");

        // length - длина - возвращает int
        int result1 = s1.length();
        System.out.println(result1 + " - кака€ длина");


        // charAt - какой элемент на индексе - возвращает char
        char result2 = s1.charAt(0);
        System.out.println(result2 + " - какой элемент на индексе");


        // indexOf - на каком индексе находитс€ элемент - возвращает int
        int result3 = s1.indexOf("el");
        System.out.println(result3 + " - где элемент 'el'");

        int result4 = s1.indexOf("lo");
        System.out.println(result4 + " - где элемент 'lo'");

        int result5 = s1.indexOf('l');
        System.out.println(result5 + " - где char 'l'");

        // поиск начина€ с какого индекса
        int result6 = s2.indexOf('a', 5);
        System.out.println(result6 + " - где искать элемент, с какого индекса");


        // startsWith - начинаетс€ ли с ... - возвращает boolean
        boolean result7 = s2.startsWith("abc");
        System.out.println(result7 + " - начинаетс€ ли");


        // endsWith - заканчиваетс€ на ... - возвращаетс€ boolean
        boolean result8 = s2.endsWith("abc");
        System.out.println(result8 + " - заканчиваетс€ ли на 'abc'");


        // subString - записывает строку, начина€ и/или заканчива€ с ... - возвращает String
        String result9 = s2.substring(3);
        System.out.println(result9 + " - присвой значение s2, начина€ с 3 индекса");

        String result10 = s2.substring(3, 7);
        System.out.println(result10 + " - присвой значение, начина€ с 3 индекса и заканчива€ 7м");


        // trim - strip - убирает пробелы по бокам - возвращает String
        String s3 = "   a  a  aa    ";
        String result11 = s3.trim();
        System.out.println(result11 + " - убери пробелы по бокам, но не внутри");


        // replace - замени что то, на что то - возвращает String
        String result12 = s1.replace("Hel", "peeer");
        System.out.println(result12 + " - помен€й это на то");


        // concat - склей что то, с чем то - возвращает String
        String result13 = s1.concat(s2);
        System.out.println(result13 + " - склей это с тем");


        // toLowerCase - перевод символов в нижний регистр - возвращает String
        String s4 = new String("WEDWDWRW");
        String result14 = s4.toLowerCase();
        System.out.println(result14 + " - переведи в нижний регистр");

        // toUpperCase - перевод символов в верхний регистр - возвращает String
        String s5 = new String("fiieuef");
        String result15 = s5.toUpperCase();
        System.out.println(result15 + " - переведи в верхний регистр");


        // contains - содержит ли ... - возвращает boolean
        boolean r1 = s1.contains("Hel");
        System.out.println(r1 + " - содержит ли символы 'Hel'");


        // isBlank - состоит ли из пробелов и табов - возвращает boolean
        String r2 = "hi";
        String r3 = "    ";
        System.out.println(r2.isBlank() + " - есть ли только пробелы - " + r3.isBlank());


        // isEmpty - пуст ли - возвращает boolean
        boolean r4 = r2.isEmpty();
        String r5 = "";
        System.out.println(r4 + " - пустой ли - " + r5.isEmpty());


        // strip - удал€ет пробелы по бокам - возвращает String
        String r6 = " dddd  ";
        System.out.println(r6.strip() + " - удали пробелы с обеих сторон");

        // stripLeading - удал€ет пробелы в начале - возвращает String
        System.out.println(r6.stripLeading() + " - удали пробелы в начале");

        // stripTrailing - удал€ет пробелы в конце - возвращает String
        System.out.println(r6.stripTrailing() + " - удали пробелы в конце");
    }
}

class method_chaining {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "uraaaaaaaaa";

        // новый объект Hello Worlduraaaa - убирает пробелы - замена uraa на ураа -- Hello worldурааа - c w до l -- worl
        String s3 = s1.concat(s2).trim().replace("uraaaaaaaaa", "ураааааа").substring(6, 10);

        // Hello World - от W до конца -- World
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}