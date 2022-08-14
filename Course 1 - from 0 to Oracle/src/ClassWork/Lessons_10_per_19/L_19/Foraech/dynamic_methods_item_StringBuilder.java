package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class dynamic_methods_item_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Bye");
        StringBuilder s3 = new StringBuilder("Yee");

        StringBuilder[] array = {s1, s2, s3};

        for (StringBuilder a : array) {
            a.append(" - New York");
        }
        // there won't be replacing
        for (StringBuilder i : array) {System.out.println(i);}
    }
}
