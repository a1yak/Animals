package Animals;

public class Vet
{
    public void treatAnimal(Animals animal)
    {
        System.out.println("This animal is from "+ animal.getLocation()+" it eats "+ animal.getFood());
    }
}
