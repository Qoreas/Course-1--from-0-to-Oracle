package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class ways_to_create_strings {
    public static void main(String[] args) {
        String s1 = new String("hi"); // Всегда новый объект

        String s2 = "DER"; // Переходит в string pool
        String s3 = "DER"; // Будет ссылаться на один объект, который находится в pool'е

        String s4 = new String("DER"); // Будет создан в любом случае, даже если он есть в pool'е
    }

}
