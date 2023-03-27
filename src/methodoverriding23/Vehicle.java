package methodoverriding23;
//java program to illustrate the use of java method overriding
//Creating a parent class
public class Vehicle {
    //defining a method
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}
//creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    public void run()
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
