package HomeWork.Lesson_4;

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
    // ����� ����������
}

class Student_test {
    public static void main(String[] args) {
        // �������� ������� � ���� � ����
        Student first_st = new Student();
        first_st.name = "Petrov";

        Student second_st = new Student();
        second_st.name = "Masha";

        Student third_st = new Student();
        third_st.name = "Katya";
        // ��� ��� ������� ��������� (�� ����� �����) ������ ��������
        // �. � � ������� �������� �� ��������� 4, �� ����� 3 � ��

        System.out.println("Student " + first_st.name + " has an arithmetic mean: " + first_st.calculateMedian(3, 4, 5));
        // ��� ����� ����� �� ������, � ����� �� ��������, �� ����� ����� ��� ������� � ���������� � ���������
        // ������� �������� ��������, ��������� ���� �����. ��� ����� ��� - ������� ����
    }
}
