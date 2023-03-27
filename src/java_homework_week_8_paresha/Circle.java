package java_homework_week_8_paresha;

/**19. Cylinder
 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
 of type double.
 The class needs to have one constructor with parameter radius of type double and it needs to initialize
 the fields.
 In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 Write the following methods (instance methods):
 ● Method named getRadius without any parameters, it needs to return the value of the radius
 field.
 ● Method named getArea without any parameters, it needs to return the calculated area
 (radius * radius * PI). For PI use Math.PI constant.
 2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
 variable) with name height of type double.
 The class needs to have one constructor with two parameters radius and height both of type double.
 It needs to call the parent constructor and initialize a height field.
 In case the height parameter is less than 0 it needs to set the height field value to 0.
 Write the following methods (instance methods):
 ● Method named getHeight without any parameters, it needs to return the value of height
 field.
 ● Method named getVolume without any parameters, it needs to return the calculated volume.
 To calculate volume, multiply the area with height.
 3. Write a class with the name Main that have main method
 TEST EXAMPLE
 → TEST CODE: Write below code into main method
 Circle circle = new Circle(3.75);
 System.out.println("circle.radius= " + circle.getRadius());
 System.out.println("circle.area= " + circle.getArea());
 Cylinder cylinder = new Cylinder(5.55, 7.25);
 System.out.println("cylinder.radius= " + cylinder.getRadius());
 System.out.println("cylinder.height= " + cylinder.getHeight());
 System.out.println("cylinder.area= " + cylinder.getArea());
 System.out.println("cylinder.volume= " + cylinder.getVolume());
 → OUTPUT
 circle.radius= 3.75
 circle.area= 44.178646691106465
 cylinder.radius= 5.55
 cylinder.height= 7.25
 cylinder.area= 96.76890771219959
 cylinder.volume= 701.574580913447
 NOTE: All methods should be defined as public NOT public static.
 NOTE: In total, you have to write 3 classes.

 *
 */
//1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
//of type double.
public class Circle {
    double radius;
//The class needs to have one constructor with parameter radius of type double and it needs to initialize
//the fields.
//In case the radius parameter is less than 0 it needs to set the radius field value to 0.
    public Circle(double radius) {
        if(radius == 0)
        {
            this.radius =0;
        }else {
            this.radius = radius;
        }
    }
    //● Method named getRadius without any parameters, it needs to return the value of the radius
    //field.
    public double getRadius()
    {
        return radius;
    }
    // Method named getArea without any parameters, it needs to return the calculated area
    //(radius * radius * PI). For PI use Math.PI constant.
    public double getArea()
    {
        return (radius*radius* Math.PI);
    }
    //2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
    //variable) with name height of type double.

    public static class Cylinder extends Circle{
        double height;
//The class needs to have one constructor with two parameters radius and height both of type double.
//It needs to call the parent constructor and initialize a height field.
//In case the height parameter is less than 0 it needs to set the height field value to 0.
        public Cylinder(double radius, double height) {
            super(radius);
            if(height ==0)
            {
                this.height =0;
            }else {
                this.height = height;
            }
        }
        //● Method named getHeight without any parameters, it needs to return the value of height
        //field.
        public double getHeight()
        {
            return height;
        }
        //● Method named getVolume without any parameters, it needs to return the calculated volume.
        //To calculate volume, multiply the area with height.
        public double getVolume()
        {
            return getArea()*height;
        }

    }
    //3. Write a class with the name Main that have main method
    //TEST EXAMPLE
    //→ TEST CODE: Write below code into main method
    //Circle circle = new Circle(3.75);
    //System.out.println("circle.radius= " + circle.getRadius());
    //System.out.println("circle.area= " + circle.getArea());
    //Cylinder cylinder = new Cylinder(5.55, 7.25);
    //System.out.println("cylinder.radius= " + cylinder.getRadius());
    //System.out.println("cylinder.height= " + cylinder.getHeight());
    //System.out.println("cylinder.area= " + cylinder.getArea());
    //System.out.println("cylinder.volume= " + cylinder.getVolume());
    public static class Main{
        public static void main(String[] args) {
            Circle circle = new Circle(3.75);
            System.out.println("circle.radius="+circle.getRadius());
            System.out.println("circle.area="+ circle.getArea());
            Cylinder cylinder = new Cylinder(5.55,7.25);
            System.out.println("cylinder.radius="+ cylinder.getRadius() );
            System.out.println("cylinder.height="+cylinder.getHeight());
            System.out.println("cylinder.area="+ cylinder.getArea());
            System.out.println("cylinder.volume="+ cylinder.getVolume());

        }
    }

}