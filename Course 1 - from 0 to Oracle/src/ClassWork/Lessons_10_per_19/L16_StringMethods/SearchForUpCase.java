package ClassWork.Lessons_10_per_19.L16_StringMethods;

public class SearchForUpCase {
    public static void main(String[] args) {
        String text = "To live life wisely, you need to know a lot. Two important rules to remember to start you: " +
                "It's better to starve than to eat anything. And it's better to be alone than with just anyone.";

        String up = text.toUpperCase();

        char c1;
        char c2;

        for (int i = 0; i < text.length(); i++) {
            c1 = text.charAt(i);
            c2 = up.charAt(i);

            if (c1 != '.' && c1 != ',' && c1 != ' ' && c1 != ':' & c1 == c2) {
                System.out.println();
                System.out.println(c1);
                continue;
            }

            System.out.print(c1);
        }

    }
}
