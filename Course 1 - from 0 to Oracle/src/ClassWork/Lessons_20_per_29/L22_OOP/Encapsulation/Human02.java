package ClassWork.Lessons_20_per_29.L22_OOP.Encapsulation;

public class Human02 {

    private boolean cleaver;
    public boolean isCleaver() {
        return cleaver;
    }
    public void setCleaver(boolean b) {
        cleaver = b;
    }
    final String sex;
    private StringBuilder name;
    // encapsulation
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s) {
        name = s;
    }

    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    public Human02(String sex) {
        this.sex = sex;
    }
}

class test_1 {
    public static void main(String[] args) {
        Human02 human = new Human02("male");
        human.setName(new StringBuilder("Kolya"));
        human.getName().append("!!!");
        System.out.println(human.getName());

    }
}
