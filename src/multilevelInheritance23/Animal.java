package multilevelInheritance23;

public class Animal {
    public void eat()
    {
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("barking...");
    }
}
class BabyDog extends Dog{
    public void weep()
    {
        System.out.println("weeping...");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
