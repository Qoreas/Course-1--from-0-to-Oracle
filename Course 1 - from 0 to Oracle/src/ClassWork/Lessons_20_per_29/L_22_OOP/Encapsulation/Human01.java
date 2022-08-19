package ClassWork.Lessons_20_per_29.L_22_OOP.Encapsulation;

public class Human01 {

    private boolean cleaver;
    public boolean isCleaver() {
        return cleaver;
    }
    public void setCleaver(boolean b) {
        cleaver = b;
    }
    final String sex;
    private String name;
    // encapsulation
    public String getName() {
        return name;
    }
    public void setName(String s) {
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
    public Human01(String sex) {
        this.sex = sex;
    }
}

class test {
    public static void main(String[] args) {
        Human01 human = new Human01("male");
        human.setName("Petya");
        human.setWeight(50);
        human.setAge(15);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
        human.setWeight(-20);
        System.out.println(human.getWeight());
    }
}
