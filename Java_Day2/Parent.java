public class Parent {
    String name;
    Parent() {
        name = "Jane Doe";
        System.out.println("Parent: Default Constructor");
        System.out.println(this);
    }

    Parent(String name) {
        this.name = name;
        System.out.println("Parent: Parameterized Constructor");
    }

    void display() {
        System.out.println("Parent: Display");
    }
}
