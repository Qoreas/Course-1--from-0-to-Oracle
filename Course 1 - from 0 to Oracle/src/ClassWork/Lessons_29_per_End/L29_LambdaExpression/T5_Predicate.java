package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;


public class T5_Predicate {
    public static void main(String[] args) {
        ArrayList<student3> list = new ArrayList<>();
        student3 s1 = new student3("Ivan", 'm', 20, 3, 8);
        student3 s2 = new student3("Nadya", 'f', 22, 4, 5.5);
        student3 s3 = new student3("Slava", 'f', 21, 5, 9);
        student3 s4 = new student3("Petya", 'm', 23, 4, 6.7);
        student3 s5 = new student3("Sasha", 'm', 20, 3, 3.4);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        studentInfo3 si = new studentInfo3();

//        si.testStudent(list, (student3 st) -> st.avgGrade > 8.5);
//        System.out.println("----------------");
//        si.testStudent(list, s -> {
//            int a = 4;
//            return s.avgGrade < 9;
//        });
//        System.out.println("----------------");
//        si.testStudent(list, s -> s.age > 21);
//        System.out.println("----------------");
//        si.testStudent(list, s -> s.sex == 'm');
//        System.out.println("----------------");
//        si.testStudent(list, s -> s.sex == 'm' && s.age > 21 && s.avgGrade > 6);

        for (student3 s : list) {
            System.out.println(s.name);
        }

        list.removeIf(x -> x.name.endsWith("a"));
        System.out.println("-------------");

        for (student3 s : list) {
            System.out.println(s.name);
        }
    }
}

class student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class studentInfo3 {
    void printStudent(student3 s) {
        System.out.println("Student name: " + s.name + ". Sex: " + s.sex + ". Age: " + s.age + ". Course: " + s.course + ". Average Grade: " + s.avgGrade);
    }

    void testStudent(ArrayList<student3> list, Predicate<student3> t) {
        for (student3 s : list) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }
}

