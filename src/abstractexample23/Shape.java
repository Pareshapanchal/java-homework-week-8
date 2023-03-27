package abstractexample23;

abstract class Shape {
    public abstract void draw();
}
class Rectangle extends Shape{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle1 extends Shape{
    public void draw()
    {
        System.out.println("drawing circle");
    }
}
class TestAbstraction1 {

    public static void main(String[] args) {
        Shape s = new Circle1();//in a real scenario, object i sprovided through methode e.g. getShape() method
        Shape s1 = new Rectangle();
        s1.draw();
        s.draw();
    }
}
