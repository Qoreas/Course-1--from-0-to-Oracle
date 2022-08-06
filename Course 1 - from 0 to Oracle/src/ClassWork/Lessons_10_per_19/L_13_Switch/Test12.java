package ClassWork.Lessons_10_per_19.L_13_Switch;

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
                System.out.println("Rating is wrong");
                break;

            case 2:
                System.out.println("Loser student");
                break;
            case 3:
                System.out.println("C student");
                break;
            case 4:
                System.out.println("B student");
                break;
            case 5:
                System.out.println("A student");
                break;
        }
    }
}