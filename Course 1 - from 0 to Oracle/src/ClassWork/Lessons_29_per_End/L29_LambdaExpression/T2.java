package ClassWork.Lessons_29_per_End.L29_LambdaExpression;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<student1> list = new ArrayList<>();
        student1 s1 = new student1("Ivan", 'm', 20, 3, 8);
        student1 s2 = new student1("Nadya", 'f', 22, 4, 5.5);
        student1 s3 = new student1("Slava", 'f', 21, 5, 9);
        student1 s4 = new student1("Petya", 'm', 23, 4, 6.7);
        student1 s5 = new student1("Sasha", 'm', 20, 3, 3.4);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        studentInfo1 si = new studentInfo1();
        findStudentOverGrade fsog = new findStudentOverGrade();
        findStudentOverGrade fsug = new findStudentOverGrade();
        findStudentOverAge fsoa = new findStudentOverAge();
        findStudentUnderAge fsua = new findStudentUnderAge();
        findStudentBySex fsbs = new findStudentBySex();
        findStudentMixCondition fsmc = new findStudentMixCondition();

        si.testStudent(list, fsog);
        System.out.println("------------------------");
        si.testStudent(list, fsug);
        System.out.println("------------------------");
        si.testStudent(list, fsoa);
        System.out.println("------------------------");
        si.testStudent(list, fsua);
        System.out.println("------------------------");
        si.testStudent(list, fsbs);
        System.out.println("------------------------");
        si.testStudent(list, fsmc );
        System.out.println("------------------------");
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
    void printStudent(student1 s) {
        System.out.println("Student name: " + s.name + ". Sex: " + s.sex + ". Age: " + s.age + ". Course: " + s.course + ". Average Grade: " + s.avgGrade);
    }

    void testStudent(ArrayList<student1> list, studentChecks sc) {
        for (student1 s : list) {
            if (sc.studentTest(s)) {
                printStudent(s);
            }
        }
    }
}

interface studentChecks {
    boolean studentTest(student1 s);
}

class findStudentOverGrade implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return s.avgGrade > 8;
    }
}

class findStudentUnderGrade implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return s.avgGrade < 8;
    }
}

class findStudentOverAge implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return s.age > 21;
    }
}

class findStudentUnderAge implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return s.age < 21;
    }
}

class findStudentBySex implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return s.sex == 'm';
    }
}

class findStudentMixCondition implements studentChecks {
    @Override
    public boolean studentTest(student1 s) {
        return (s.sex == 'm' && s.age < 22 && s.avgGrade > 7);
    }
}