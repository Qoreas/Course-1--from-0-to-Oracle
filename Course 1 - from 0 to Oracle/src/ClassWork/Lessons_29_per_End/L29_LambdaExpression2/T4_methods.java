package ClassWork.Lessons_29_per_End.L29_LambdaExpression2;

import java.util.List;
import java.util.function.Predicate;

public class T4_methods {
    public static void main(String[] args) {
        List<String> list = List.of("hi", "bye", "How are you?", "all right");
        String str = "klnfjknfjen";
        for (String s : list) {
            Predicate<String> p = s1 -> {
                System.out.println(str.length());
                return s1.length() > 4;
            };
        }


//        list.forEach(s -> System.out.println(s));
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(3);
//        arrayList.add(2);
//        arrayList.add(6);
//        arrayList.add(4);
//        arrayList.add(1);
//        arrayList.add(7);
//        arrayList.add(5);
//
//
////        arrayList.removeIf(element -> element % 3 == 0);
////        Predicate<Integer> p = element -> element % 3 == 0;
////        arrayList.removeIf(p);
//        System.out.println(arrayList);
//
//        arrayList.sort((x, y) -> x.compareTo(y));
//
//        System.out.println(arrayList);
//
//        arrayList.sort((x, y) -> -x.compareTo(y));
//
//        System.out.println(arrayList);
    }
}
