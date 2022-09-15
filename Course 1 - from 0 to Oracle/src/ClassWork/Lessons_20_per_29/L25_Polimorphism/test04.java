package ClassWork.Lessons_20_per_29.L25_Polimorphism;

public class test04 {
    public static void main(String[] args) {
        String[] array1 = {"Hi", "bye"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
//        array3[0] = new StringBuilder("ok");
//        array2[0] = new StringBuilder("Hello");
    }
}
