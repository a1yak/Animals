package Animals;

public class Horse extends Animals implements Creature
{
    private String breed;

    public void sleep()
    {
        System.out.println("Horse is sleeping...");
    }
    public void eat(String food)
    {
        System.out.println("Нокыу eats "+ food);
    }

    public Horse(String location, String food, String breed, String name) {
        super(location, food, name);
        this.breed = breed;
    }
    public void makeNoise() {
        System.out.println("iiiiiii!");
    }
    public void display()
    {
        System.out.println(this.name + " is a horse ");
        makeNoise();
    }
}
