package HomeWork.Lessons_20_per_29.L21;

public class animal {
    animal() {
        System.out.println("Im animal");
    }
    int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class pet extends animal{
    pet() {
        System.out.println("Im pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }

}

class dog extends pet {
    dog(String name) {
        this.name = name;
        System.out.println("Im dog and my name is " + this.name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class cat extends pet {
    cat(String name) {
        this.name = name;
        System.out.println("Im cat and my name is " + this.name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class test_animal {
    public static void main(String[] args) {
        dog d = new dog("Peter");
        System.out.println(d.paw);

        cat c = new cat("Pandora");
        c.sleep();
    }
}