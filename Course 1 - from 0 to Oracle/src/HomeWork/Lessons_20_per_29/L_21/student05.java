package HomeWork.Lessons_20_per_29.L_21;

public class student05 {
    private StringBuilder name;
    private int course;
    private double grade;

    public void setName(StringBuilder name1) {
        if (name1.length() > 3) {
            name = name1;
        } else {
            System.out.println("Name length less than 3");
        }
    }

    public StringBuilder getName() {
        StringBuilder n = name;
        System.out.println(n);
        return n;
    }

    public void setCourse(int course1) {
        if (course1 > 1 && course1 <= 4) {
            course = course1;
        } else {
            System.out.println("Course number is not correct");
        }
    }

    public int getCourse() {
        int c = course;
        System.out.println(c);
        return c;
    }

    public void setGrade(double grade1) {
        if (grade1 >= 1 && grade1 <= 10) {
            grade = grade1;
        } else {
            System.out.println("Grade is not correct");
        }
    }

    public double getGrade() {
        double d = grade;
        System.out.println(d);
        return d;
    }

    public static void showInfo(student05 st)  {
        System.out.println("Student name: " + st.name);
        System.out.println("Student course: " + st.course);
        System.out.println("Student grade: " + st.grade);
    }
}

class testStudent05  {
    public static void main(String[] args) {
        student05 st = new student05();

        st.setName(new StringBuilder("Artur"));
        st.setCourse(3);
        st.setGrade(6.9);

        st.getName();
        st.getCourse();
        st.getGrade();

        student05.showInfo(st);
    }
}
