class Shape {
    protected String shapeName;
    Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }
    double calculateArea() {return 0;}
}

class Square extends Shape{
    int side;
    Square(int side)
    {
        super("Square");
        this.side = side;
    }
    @Override
    double calculateArea() {
        return side*side;
    }
}
class Rectangle extends Shape{
    int length, breadth;
    Rectangle(int length, int breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }
}

class ShapeUse{
    public static void main(String args[])
    {
        Shape sh = new Square(4);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
        sh = new Circle(4);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
        sh = new Rectangle(5, 7);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
    }
}