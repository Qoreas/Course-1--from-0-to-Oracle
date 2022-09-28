package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        ArrayList<student2> list = new ArrayList<>();
        student2 s1 = new student2("Ivan", 'm', 20, 3, 8);
        student2 s2 = new student2("Nadya", 'f', 22, 4, 5.5);
        student2 s3 = new student2("Slava", 'f', 21, 5, 9);
        student2 s4 = new student2("Petya", 'm', 23, 4, 6.7);
        student2 s5 = new student2("Sasha", 'm', 20, 3, 3.4);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        studentInfo2 si = new studentInfo2();

        si.testStudent(list, (student2 st) -> st.avgGrade > 8.5);
        System.out.println("----------------");
        si.testStudent(list, s -> {
            int a = 4;
            return s.avgGrade < 9;
        });
        System.out.println("----------------");
        si.testStudent(list, s -> s.age > 21);
        System.out.println("----------------");
        si.testStudent(list, s -> s.sex == 'm');
        System.out.println("----------------");
        si.testStudent(list, s -> s.sex == 'm' && s.age > 21 && s.avgGrade > 6);

    }
}

class student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class studentInfo2 {
    void printStudent(student2 s) {
        System.out.println("Student name: " + s.name + ". Sex: " + s.sex + ". Age: " + s.age + ". Course: " + s.course + ". Average Grade: " + s.avgGrade);
    }

    void testStudent(ArrayList<student2> list, studentChecks2 sc) {
        for (student2 s : list) {
            if (sc.check(s)) {
                printStudent(s);
            }
        }
    }
}

interface studentChecks2 {
    boolean check(student2 s);
}