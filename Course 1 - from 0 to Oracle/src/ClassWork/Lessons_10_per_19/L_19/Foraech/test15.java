package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class test15 {
    public static void main(String[] args) {
        String[] array = {"Hi", "Bye"};

        for (String s : array) {
            s = new String("He");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
