package ClassWork.Lessons_10_per_19.L_17_StringBuilder;

class car {
}

public class methods_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // capacity - גלוסעטלמסעü
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb3.length()); // length

        System.out.println(sb2.charAt(3));

        System.out.println(sb2.indexOf(" ")); // char NOT ALLOWED

        String s1 = sb2.substring(5);
        System.out.println(s1);

        String s2 = sb2.substring(5, 8);
        System.out.println(s2);


        // NEW

        System.out.println(sb2.subSequence(5, 8)); // like substring - output CharSequence

        sb2.append(22); // sb2 = "Good day" + 22
        System.out.println(sb2);

        sb2.append(true);
        System.out.println(sb2);

        sb2.append(sb2);
        System.out.println(sb2);

        sb2.append(new car());
        System.out.println(sb2);


        System.out.println(sb2.insert(4, 55)); // ctrl + v in place, what you want


        StringBuilder sb10 = new StringBuilder("hello world");

        sb10.delete(3, 6);
        System.out.println(sb10);

        sb10.deleteCharAt(0); // dotted
        System.out.println(sb10);


        sb10.reverse();
        System.out.println(sb10);


        StringBuilder sb12 = new StringBuilder("Hi everyone!!!");

        sb12.replace(0, 5, "Pete");
        System.out.println(sb12);


        System.out.println(sb12.capacity());

        System.out.println(sb1.capacity());


    }
}
