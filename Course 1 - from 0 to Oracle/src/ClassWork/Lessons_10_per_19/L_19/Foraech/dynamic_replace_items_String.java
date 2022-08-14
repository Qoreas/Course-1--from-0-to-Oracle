package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class dynamic_replace_items_String {
    public static void main(String[] args) {
        String[] array = {"Hello", "bye"};

        for (String a : array) {
            a = "hi";
        }
        // there won't be replacing
        for (String i : array) {System.out.println(i);}
    }
}
