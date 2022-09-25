package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<student1> list = new ArrayList<>();
        student1 st1 = new student1("Ivan", 'm', 19, 3, 8.2);
        student1 st2 = new student1("Petr", 'm', 23, 5, 4.5);
        student1 st3 = new student1("Maria", 'f', 20, 2, 5.3);
        student1 st4 = new student1("Anna", 'f', 21, 4, 9);
        student1 st5 = new student1("Georgy", 'm', 18, 1, 7.2);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        studentInfo1 si = new studentInfo1();
        findStudentOverGrade fsog = new findStudentOverGrade();
        si.testStudents(list, fsog);
    }
}

class student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class studentInfo1 {
    void printStudent(student1 st) {
        System.out.println("Student name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", average grade: " + st.avgGrade);
    }

    void testStudents(ArrayList<student1> list, studentChecks sC) {
        for (student1 s : list) {
            if (sC.testStudent(s)) {
                System.out.println(s);
            }
        }
    }
}

interface studentChecks {
    boolean testStudent(student1 st);
}

class findStudentOverGrade implements studentChecks {
    @Override
    public boolean testStudent(student1 st) {
        return st.avgGrade > 8;
    }
}