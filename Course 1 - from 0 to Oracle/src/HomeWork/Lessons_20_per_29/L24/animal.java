package HomeWork.Lessons_20_per_29.L24;


public abstract class animal {
    animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class fish extends animal {
    fish(String name) {
        super(name);
        this.name = name;
    }

    String name;

    @Override
    void sleep() {
        System.out.println("Always interesting to watch, how fish sleeps");
    }

    abstract void swim();
}

abstract class bird extends animal implements speakAble {
    bird(String name) {
        super(name);
        this.name = name;
    }

    String name;

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class mammal extends animal implements speakAble {
    mammal(String name) {
        super(name);
        this.name = name;
    }

    String name;

    abstract void run();
}

interface speakAble {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class swordFish extends fish {
    swordFish(String name) {
        super(name);
        this.name = name;
    }

    String name;

    @Override
    void swim() {
        System.out.println("Sword Fish is beautiful fish, that can swim really fast!");
    }

    @Override
    void eat() {
        System.out.println("Sword Fish not a hunter, and she eats default fish feed!");
    }
}

class penguin extends bird {
    penguin(String name) {
        super(name);
        this.name = name;
    }

    String name;

    @Override
    void eat() {
        System.out.println("Penguin likes to eat fish!");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep together");
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    public void speak() {
        System.out.println("Penguin can't sing like a nightingale ");
    }
}

class lion extends mammal {
    lion(String name) {
        super(name);
        this.name = name;
    }

    String name;

    @Override
    void eat() {
        System.out.println("Lion, like everyone hunter, likes meat!");
    }

    @Override
    void sleep() {
        System.out.println("Big part of time lion sleeps!");
    }

    @Override
    void run() {
        System.out.println("Lion - not the fastest cat!");
    }
}

class lesson24 {
    public static void main(String[] args) {
        swordFish swordFish = new swordFish("Halk");
        System.out.println(swordFish.name);
        swordFish.eat();
        swordFish.sleep();
        swordFish.swim();

        speakAble penguin = new penguin("Ralf");
        penguin.speak();

        animal lion = new lion("Volvo");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        mammal lion1 = new lion("Mers");
        System.out.println(lion1.name);
        lion1.eat();
        lion1.run();
        lion1.sleep();
        lion1.speak();
    }
}