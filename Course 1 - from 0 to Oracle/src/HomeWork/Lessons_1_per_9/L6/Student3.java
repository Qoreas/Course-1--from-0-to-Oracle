package HomeWork.Lessons_1_per_9.L6;

public class Student3 {
    int ticket;
    String name;
    String surname;
    int year;
    double median_math;
    double median_economic;
    double median_eng;

    Student3(int ticketSet, String nameSet, String surnameSet, int yearSet, double math, double eng, double eco) {
        ticket = ticketSet;
        name = nameSet;
        surname = surnameSet;
        year = yearSet;
        median_math = math;
        median_eng = eng;
        median_economic = eco;
    }

    Student3(int ticket, String name, String surname, int year) {
        this(ticket, name, surname, year, 0, 0, 0);
    }

    Student3() {
    }

    void calculateMedian() {
        double result = (median_economic + median_math + median_eng) / 3;
        System.out.println(result);
    }

    // or
    double calculateMedian2(Student3 st) {
        double result = (st.median_economic + st.median_math + st.median_eng) / 3;
        System.out.println(result);
        return result;
    }

}

class Student3_test {
    public static void main(String[] args) {
        Student3 first_st = new Student3(1, "Petya", "Elcin", 2000, 5.4, 7.4, 9.9);

        Student3 second_st = new Student3(2, "Masha", "Mihaylova", 1998, 7.2, 4.1, 6.4);

        Student3 third_st = new Student3(3, "Katya", "Lenina", 1999, 8.1, 6.9, 4.3);

        second_st.calculateMedian();

        Student3 test = new Student3(0, "", "", 0, 0, 0, 0);
        test.calculateMedian2(second_st);

        Student3 test2 = new Student3(4, "Igor", "Puppe", 2000);
        System.out.println(test2.median_economic);

        Student3 test3 = new Student3();
        System.out.println(test3.ticket);
    }
}