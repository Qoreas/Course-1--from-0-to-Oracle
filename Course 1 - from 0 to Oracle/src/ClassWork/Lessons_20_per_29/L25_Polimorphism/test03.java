package ClassWork.Lessons_20_per_29.L25_Polimorphism;

public class test03 {
    public static void main(String[] args) {
        jumpAble j = new man();
        man m = new man();
        student s = new student();

        if (j instanceof jumpAble) {
            System.out.println("J is jump able");
        }

        if (m instanceof human) {
            System.out.println("M is human");
        }

//        if (s instanceof human) {
//            System.out.println("S is human");
//        }
        // compilator don't know, implemented student jumpAble or not
        if (s instanceof jumpAble) {
            System.out.println("S is jump able");
        }
    }
}

interface jumpAble {
}

class human implements jumpAble{}
class man extends human{}
class student{}
