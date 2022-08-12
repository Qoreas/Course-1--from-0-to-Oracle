package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class test13 {
    public static void main(String[] args) {
        String[] students = {"Petya", "Masha", "Katya"};
        String[] exams = {"Math", "Philosophy"};

        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " - " + s2);
            }
        }
    }
}
