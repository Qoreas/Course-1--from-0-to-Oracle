package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class methods_string {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("abcdefabc");

        // length - returns int
        int result1 = s1.length();
        System.out.println(result1 + " - what length");


        // charAt - what element at index - returns char
        char result2 = s1.charAt(0);
        System.out.println(result2 + " - what element at index");


        // indexOf - at what index the element is - returns
        int result3 = s1.indexOf("el");
        System.out.println(result3 + " - where is element 'el'");

        int result4 = s1.indexOf("lo");
        System.out.println(result4 + " - where is element 'lo'");

        int result5 = s1.indexOf('l');
        System.out.println(result5 + " - where is char 'l'");

        // search starting from which index
        int result6 = s2.indexOf('a', 5);
        System.out.println(result6 + " - where to look for the element, from what index");


        // startsWith - does it start with ... - returns boolean
        boolean result7 = s2.startsWith("abc");
        System.out.println(result7 + " - does it start");


        // endsWith - ends with ... - returns boolean
        boolean result8 = s2.endsWith("abc");
        System.out.println(result8 + " - does it end with 'abc'");


        // subString - writes a string starting and/or ending with ... - returns String
        String result9 = s2.substring(3);
        System.out.println(result9 + " - assign value to s2 starting at index 3");

        String result10 = s2.substring(3, 7);
        System.out.println(result10 + " - assign a value starting at index 3 and ending at index 7");


        // trim - strip - removes spaces on the sides - returns String
        String s3 = "   a  a  aa    ";
        String result11 = s3.trim();
        System.out.println(result11 + " - remove the spaces on the sides, but not inside");


        // replace - replace something with something - returns String
        String result12 = s1.replace("Hel", "peeer");
        System.out.println(result12 + " - change it to that");


        // concat - glue something with something - returns String
        String result13 = s1.concat(s2);
        System.out.println(result13 + " - glue it with that");


        // toLowerCase - converting characters to lowercase - returns String
        String s4 = new String("WEDWDWRW");
        String result14 = s4.toLowerCase();
        System.out.println(result14 + " - convert to lowercase");

        // toUpperCase - converting characters to upper case - returns String
        String s5 = new String("fiieuef");
        String result15 = s5.toUpperCase();
        System.out.println(result15 + " - convert to upper case");


        // contains - does it contain ... - returns boolean
        boolean r1 = s1.contains("Hel");
        System.out.println(r1 + " - whether it contains 'Hel' characters");


        // isBlank - whether it consists of spaces and tabs - returns boolean
        String r2 = "hi";
        String r3 = "    ";
        System.out.println(r2.isBlank() + " - is there only spaces - " + r3.isBlank());


        // isEmpty - is it empty - returns boolean
        boolean r4 = r2.isEmpty();
        String r5 = "";
        System.out.println(r4 + " - is empty - " + r5.isEmpty());


        // strip - removes spaces on the sides - returns String
        String r6 = " dddd  ";
        System.out.println(r6.strip() + " - remove spaces on both sides");

        // stripLeading - removes spaces at the beginning - returns String
        System.out.println(r6.stripLeading() + " - remove the spaces at the beginning");

        // stripTrailing - removes spaces at the end - returns String
        System.out.println(r6.stripTrailing() + " - remove the spaces at the end");
    }
}

class method_chaining {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "uraaaaaaaaa";

        // new object Hello Worlduraaaa - remove spaces - replace uraa with cheers -- Hello worldÛ‡‡‡ - from w to l -- worl
        String s3 = s1.concat(s2).trim().replace("uraaaaaaaaa", "Û‡‡‡‡‡‡").substring(6, 10);

        // Hello World - from W until end -- World
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}