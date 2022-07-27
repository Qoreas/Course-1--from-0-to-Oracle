package ClassWork.Lessons_1_per_9.Lesson_6_Overloading_Methods;

public class tests {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int median(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }
}
