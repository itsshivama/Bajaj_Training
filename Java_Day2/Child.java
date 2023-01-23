public class Child extends Parent{
    Child() {
        //super("Child Default to Parent Parameterized");
//        name = "Son";
        System.out.println("Child: Default Constructor");
        System.out.println(this);
    }

    Child(String name) {
        this.name = name;
        System.out.println("Child: Parameterized Constructor");
    }

    void printName()
    {
        System.out.println(name);
    }

    void display()
    {
        System.out.println("Child: Display");
    }

    void show()
    {
        System.out.println("Child: SHow");
    }
}
