package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class method_chaining {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Yeeeees";

        // s1 + s2 -> del spaces -> del "Yess..", add "Óðà.." -> 'worl'
        String s3 = s1.concat(s2).trim().replace("Yeeeees", "Óðàààààà").substring(6, 10);

        // hello world.substring(6) -> new object "World"
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
