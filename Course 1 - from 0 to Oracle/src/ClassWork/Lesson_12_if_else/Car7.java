package ClassWork.Lesson_12_if_else;

public class Car7 {
    int engine;
    int doorsCount;

    Car7(int engine, int doors) {
        this.engine = doors;
        doorsCount = doors;
    }
}

class car7_test {
    public static void main(String[] args) {
        Car7 c1 = new Car7(4, 4);
        Car7 c2 = new Car7(3, 3);

        if (c1.engine > c2.engine) {
            if (c1.doorsCount > c2.doorsCount) {
                System.out.println("�������� ������ � ���������� ������ ������ � ������ ������");
            } else {
                System.out.println("�������� ������ � ������ ������ ������, �� ���-�� ������ ������");
            }
        } else {
            System.out.println("�������� ������ � ������ ������ ������");
        }
    }
}