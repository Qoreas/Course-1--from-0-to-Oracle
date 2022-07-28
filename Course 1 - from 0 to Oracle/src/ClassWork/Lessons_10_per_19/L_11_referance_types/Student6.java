package ClassWork.Lessons_10_per_19.L_11_referance_types;

public class Student6 {
     String name; int course; double grade;

     Student6(String name, int course, double grade) {
          this.name = name;
          this.course = course;
          this.grade = grade;
     }

     public static void swap(Student6 st1, Student6 st2) {
          Student6 st3 = st1;
          st1 = st2;
          st2 = st3;
          System.out.println(st1.name);
     }

     public static void changeName(Student6 s1) {
          s1.name = "Vasiliy";
     }

     public static void main(String[] args) {
          Student6 st1 = new Student6("Petya", 3, 7.9);
          Student6 st2 = new Student6("Vanya", 3, 5.2);

          swap(st1, st2);
          System.out.println(st1.name);
          System.out.println(st2.name);

          changeName(st2);
          System.out.println(st2.name);
     }
}
