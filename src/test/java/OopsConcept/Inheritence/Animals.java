package OopsConcept.Inheritence;

public class Animals
{
    String name;
    public void eat()
    {
        System.out.println("I eat food");
    }
}
class Dog extends Animals
{
    public void display()
    {
        System.out.println("My name is :"+name);
    }
}
class main
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="Mickey";
        dog.display();
        dog.eat();
    }
}
