package java_homework_week_8_paresha;

/**16. Point
 You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 fields (instance variables) with name x and y of type int.
 The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 fields.
 Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this
 Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance
 between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance
 between this Point and another Point as double.
 How to find the distance between two points?
 To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 Where √ represents square root.
 TEST EXAMPLE
 → TEST CODE: Write the below code into the main method.
 Point first = new Point(6, 5);
 Point second = new Point(3, 1);
 System.out.println("distance(0,0)= " + first.distance());
 *
 */

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 *  fields (instance variables) with name x and y of type int.
 *  The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 *  constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 *  fields.
 */
public class Point {
    int x,y;

    public Point() {//constructor without parameter
    }

    public Point(int x, int y) {//constructor with parameter and initialise the instance variables
        this.x = x;
        this.y = y;
    }
    //* Method named getX without any parameters, it needs to return the value of x field.
    public int getX()//return the value of x
    {
        return x;
    }
    //* Method named getY without any parameters, it needs to return the value of y field.
    public int getY()//return the value of y
    {
        return y;
    }
    // * Method named setX with one parameter of type int, it needs to set the value of the x field.
    public void setX(int x)// set value of x
    {
        this.x =x;
    }
    //* Method named setY with one parameter of type int, it needs to set the value of the y field.
    public void setY(int y)//set value of y
    {
        this.y =y;
    }
    // * Method named distance without any parameters, it needs to return the distance between this
    // Point and Point 0,0 as double.
    public double distance() {
        return distance(0,0);
    }
    //* Method named distance with two parameters x, y both of type int, it needs to return the distance
    // between this Point and Point x,y as double.
    //To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
    //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    //Where √ represents square root.
    public double distance(int x,int y)
    {
       return Math.sqrt((x - this.x)*(x-this.x) + (y - this.y)*(y -this.y));
    }
    // * Method named distance with parameter another of type Point, it needs to return the distance
    // between this Point and another Point as double.

    public double distance(Point secondPoint)
    {
        return distance(secondPoint.x, secondPoint.y);
    }
//    → TEST CODE: Write the below code into the main method.
//    Point first = new Point(6, 5);
//    Point second = new Point(3, 1);
//System.out.println("distance(0,0)= " + first.distance());
//System.out.println("distance(second)= " + first.distance(second));
//System.out.println("distance(2,2)= " + first.distance(2, 2));
//    Point point = new Point();
//System.out.println("distance()= " + point.distance());

    public static void main(String[] args) {// main method

        Point first = new Point(6,5);//call constructor with parameter
        Point second = new Point(3,1);//call constructor with parameter
        System.out.println("distance(0,0)="+ first.distance());// call distance method without parameter
        System.out.println("distance(second)="+first.distance(second));//call distance method with parameters are object
        System.out.println("distance(2,2)="+first.distance(2,2));// call distance method with parameter are int x and int y
        Point point = new Point();//call constructor without parameter
        System.out.println("distance()="+point.distance());// will call distance method without parameter and constructor without parameter

    }


}
