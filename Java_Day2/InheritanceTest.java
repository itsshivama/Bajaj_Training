public class InheritanceTest {

    static void checkInheritance(Parent obj)
    {
        obj.display();
    }

    public static void main(String args[])
    {
        Child c = new Child();
        Child ref;
        ref = new Child();
        ref.display();
        checkInheritance(ref);
    }
}
