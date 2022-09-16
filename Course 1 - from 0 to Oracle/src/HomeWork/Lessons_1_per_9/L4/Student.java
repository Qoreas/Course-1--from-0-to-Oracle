package HomeWork.Lessons_1_per_9.L4;

public class Student {
    int ticket;
    String name;
    String surname;
    int year;
    double median_math;
    double median_economic;
    double median_eng;

    double calculateMedian(double point1, double point2, double point3) {
        double result = (point1 + point2 + point2) / 3;
        return result;
    }
    // Parameter set
}

class StudentTest {
    public static void main(String[] args) {
        // creating an object and its reference
        Student first_st = new Student();
        first_st.name = "Petrov";

        Student second_st = new Student();
        second_st.name = "Masha";

        Student third_st = new Student();
        third_st.name = "Katya";
        //here for each parameter (it is after the dot) we set the value
        //i.e. the first student has 4 in economics, 3 in English, etc.

        System.out.println("Student " + first_st.name + " has an arithmetic mean: " + first_st.calculateMedian(3, 4, 5));
        // here will be the output of their grades, and to get them, we will take the name of the student and refer to the parameter
        // which contains the value we entered earlier. Here is the code - big fuck
    }
}
