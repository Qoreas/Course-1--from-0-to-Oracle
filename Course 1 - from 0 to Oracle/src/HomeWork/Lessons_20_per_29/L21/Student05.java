package HomeWork.Lessons_20_per_29.L21;

public class Student05 {
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
        StringBuilder n = new StringBuilder(name);
        System.out.println(n);
        return n;
    }

    public void setCourse(int course1) {
        if (course1 >= 1 && course1 <= 4) {
            course = course1;
        } else {
            System.out.println("Course number is not correct");
        }
    }

    public int getCourse() {
        System.out.println(course);
        return course;
    }

    public void setGrade(double grade1) {
        if (grade1 >= 1 && grade1 <= 10) {
            grade = grade1;
        } else {
            System.out.println("Grade is not correct");
        }
    }

    public double getGrade() {
        System.out.println(grade);
        return grade;
    }

    public void showInfo()  {
        getName();
        getCourse();
        getGrade();
    }
}

class Student05_Test {
    public static void main(String[] args) {
        Student05 st = new Student05();

        st.setName(new StringBuilder("Artur"));
        st.setCourse(3);
        st.setGrade(6.9);

        st.showInfo();
    }
}
