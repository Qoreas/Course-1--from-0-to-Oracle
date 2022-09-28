package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        student s1 = new student("Ivan", 'm', 20, 3, 8);
        student s2 = new student("Nadya", 'f', 22, 4, 5.5);
        student s3 = new student("Slava", 'f', 21, 5, 9);
        student s4 = new student("Petya", 'm', 23, 4, 6.7);
        student s5 = new student("Sasha", 'm', 20, 3, 3.4);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        studentInfo si = new studentInfo();
        si.printStudentOverGrade(list, 8.5);
        System.out.println("-------------------------------");
        si.printStudentUnderGrade(list, 8.5);
        System.out.println("-------------------------------");
        si.printStudentOverAge(list, 21);
        System.out.println("-------------------------------");
        si.printStudentUnderAge(list, 21);
        System.out.println("-------------------------------");
        si.printStudentBySex(list, 'f');
        System.out.println("-------------------------------");
        si.printStudentMixCondition(list, 'm', 20, 7);
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
    void printStudent(student s) {
        System.out.println("Student name: " + s.name + ". Sex: " + s.sex + ". Age: " + s.age + ". Course: " + s.course + ". Average Grade: " + s.avgGrade);
    }

    void printStudentOverGrade(ArrayList<student> list, double grade) {
        for (student s : list) {
            if (s.avgGrade > grade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderGrade(ArrayList<student> list, double grade) {
        for (student s : list) {
            if (s.avgGrade < grade) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<student> list, int age) {
        for (student s : list) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<student> list, int age) {
        for (student s : list) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentBySex(ArrayList<student> list, char sex) {
        for (student s : list) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<student> list, char sex, int age, double avgGrade) {
        for (student s : list) {
            if (s.sex == sex && s.age < age && s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }
}