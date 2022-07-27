package ClassWork.Lessons_10_per_19.Lesson_13A_Switch;

public class Test12 {

}

class Student12 {
    int grade;
    Student12(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student12 st = new Student12(3);

        switch (st.grade) {
            default:
                System.out.println("Оценка неверна");   break;

            case 2:
                System.out.println("Студент двоечник"); break;
            case 3:
                System.out.println("Студент троечник"); break;
            case 4:
                System.out.println("Студент хорошист"); break;
            case 5:
                System.out.println("Студент отличник"); break;
        }
    }
}