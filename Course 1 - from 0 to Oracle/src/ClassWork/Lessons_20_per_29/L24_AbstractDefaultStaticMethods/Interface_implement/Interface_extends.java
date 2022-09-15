package ClassWork.Lessons_20_per_29.L24_AbstractDefaultStaticMethods.Interface_implement;

public class Interface_extends {
}

class human01 implements jumpAble01 {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class animal01 implements jumpAble01 {
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface jumpAble01 {
    void jump();
}

interface A01 {
    void abc();
}

interface B01 extends A01, jumpAble01 {
    void def();
}
//                    extends A01 methods
abstract class D02 implements B01 {

}