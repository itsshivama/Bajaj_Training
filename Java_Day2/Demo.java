interface A {
    void foo();
}
interface B {
    void moo();
}
class C implements A, B {
    public void foo() {
        System.out.println("Animal is eating");
    }
    public void moo() {
        System.out.println("Animal is travelling");
    }
}

public class Demo {
    public static void main(String args[]) {
        C a = new C();
        a.foo();
        a.moo();
        //AnimalTravel.eat();
        //Animal.eat();
    }
}
