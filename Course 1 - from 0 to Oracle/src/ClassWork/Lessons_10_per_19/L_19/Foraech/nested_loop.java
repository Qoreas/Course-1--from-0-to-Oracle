package ClassWork.Lessons_10_per_19.L_19.Foraech;

public class nested_loop {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Ilyin"};
        String[] exams = {"Math", "Philosophy"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println(student + " - " + exam);
            }
        }
    }
}
