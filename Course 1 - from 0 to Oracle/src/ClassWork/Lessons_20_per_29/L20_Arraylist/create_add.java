package ClassWork.Lessons_20_per_29.L20_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class create_add {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  // Don't have datatype
        list.add("He");

        Test c = new Test();
        list.add(c);

        Student s = new Student();
        list.add(s);


        ArrayList <String> list2 = new ArrayList<>(); // Have datatype
        list2.add("bye");
//        list2.add(4); Won't work

        List <String> listNew = new ArrayList<>(); // New type
        listNew.add("hi");


        ArrayList <String> list4 = new ArrayList<>(5); // With capacity -- default - 10


        ArrayList <String> list5 = new ArrayList<>(list2); // different link, one item
        System.out.println(list5.equals(list2));


    }
}

class Test {}
class Student{}