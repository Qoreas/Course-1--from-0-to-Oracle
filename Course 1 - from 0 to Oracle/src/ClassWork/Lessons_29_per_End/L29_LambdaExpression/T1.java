package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        student st1 = new student("Ivan", 'm', 19, 3, 8.2);
        student st2 = new student("Petr", 'm', 23, 5, 4.5);
        student st3 = new student("Maria", 'f', 20, 2, 5.3);
        student st4 = new student("Anna", 'f', 21, 4, 9);
        student st5 = new student("Georgy", 'm', 18, 1, 7.2);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        studentInfo sI = new studentInfo();

        sI.printStudentsOverGrade(list, 8.5);
        System.out.println("----------------------");
        sI.printStudentsUnderGrade(list, 8);
        System.out.println("----------------------");
        sI.printStudentsOverAge(list, 22);
        System.out.println("----------------------");
        sI.printStudentsUnderAge(list, 20);
        System.out.println("----------------------");
        sI.printStudentsBySex(list, 'm');
        System.out.println("----------------------");
        sI.printStudentsMixCondition(list, 5, 23, 'f');

    }
}

class student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class studentInfo {
    void printStudent(student st) {
        System.out.println("Student name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", average grade: " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<student> aL, double avgGrade) {
        for (student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<student> aL, double avgGrade) {
        for (student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<student> aL, int age) {
        for (student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<student> aL, int age) {
        for (student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<student> aL, char sex) {
        for (student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<student> aL, double avgGrade, int age, char sex) {
        for (student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }
}