package OopsConcept.Polimorphism;

public class Overriding
{
    public void animalSound()
    {
        System.out.println("Animals makes Sounds");
    }

}
class Pig extends Overriding
{
    public void animalSound()
    {
        System.out.println("Pig makes Oink Oink Sound");
    }
}
class Cow extends Overriding
{
    public void animalSound()
    {
        System.out.println("Cow makes Moo MooSound");
    }
}
class main
{
    public static void main(String[] args)
    {
        Overriding newAnimal = new Overriding();
        Overriding newPig = new Pig();
        Overriding newCow  = new Cow();
        newAnimal.animalSound();
        newPig.animalSound();
        newCow.animalSound();

    }
}

