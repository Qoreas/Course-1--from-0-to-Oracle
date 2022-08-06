package HomeWork.Lessons_10_per_19.L_16;

public class mailDetector {

    static void email(String mail) {

        char dog = '@';
        char point = '.';

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == dog) {
                i++;

                while (mail.charAt(i) != point) {
                    System.out.print(mail.charAt(i));
                    i++;
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        email("aWWWd@mail.com; deeee@yahoo.com; kememe@gmail.ru;");
    }
}
