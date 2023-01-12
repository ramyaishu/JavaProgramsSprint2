package OopsConcept.Abstract;

abstract class Animal
{
    public abstract void makeSound();
    public void sleep()
    {
        System.out.println("zzz");
    }

}
class Pig extends Animal
{
    public void makeSound()
    {
        System.out.println("Oink Oink");
    }
    public void eatFood()
    {
        System.out.println("Pig eats vegiees");
    }
}

class Sheep extends Animal
{

    @Override
    public void makeSound()
    {

        System.out.println("Baaaa");
    }
    public void eatFood()
    {
        System.out.println("Grass");
    }

}
class AnimalTest
{
    public static void main(String[] args) {
        Pig pig = new Pig();
        Sheep sheep = new Sheep();
      pig.makeSound();
      pig.sleep();
      pig.eatFood();
      sheep.makeSound();
      sheep.sleep();
      sheep.eatFood();
    }
}
