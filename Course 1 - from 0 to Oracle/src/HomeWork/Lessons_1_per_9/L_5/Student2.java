package HomeWork.Lessons_1_per_9.L_5;

public class Student2 {
    int ticket;
    String name;
    String surname;
    int year;
    double median_math;
    double median_economic;
    double median_eng;

    void calculateMedian() {
        double result = (median_economic + median_math + median_eng) / 3;
        System.out.println(result);
    }

    // or
    double calculateMedian2(Student2 st) {
        double result = (st.median_economic + st.median_math + st.median_eng) / 3;
        System.out.println(result);
        return result;
    }

}

class Student2_test {
    public static void main(String[] args) {
        // creating an object and its reference
        Student2 first_st = new Student2();
        first_st.name = "Petrov";
        first_st.surname = "Elcin";
        first_st.ticket = 1;
        first_st.median_economic = 5.4;
        first_st.median_eng = 7.4;
        first_st.median_math = 9.9;

        Student2 second_st = new Student2();
        second_st.name = "Masha";
        second_st.surname = "Mihaylova";
        second_st.ticket = 2;
        second_st.median_economic = 7.2;
        second_st.median_eng = 4.1;
        second_st.median_math = 6.4;

        Student2 third_st = new Student2();
        third_st.name = "Katya";
        third_st.surname = "Lenina";
        third_st.ticket = 3;
        third_st.median_economic = 4.3;
        third_st.median_eng = 6.9;
        third_st.median_math = 8.1;

        second_st.calculateMedian();

        Student2 test = new Student2();
        test.calculateMedian2(second_st);
    }
}