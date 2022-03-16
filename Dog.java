package Animals;

public class Dog extends Animals implements Creature{

    private String agression;

    public void eat(String food)
    {
        System.out.println("Dog eats "+ food);
    }
    public void sleep()
    {
        System.out.println("Dog is sleeping...");
    }

    public Dog(String location, String food, String agression, String name) {
        super(location, food, name);
        this.agression = agression;

    }

    @Override
    public void makeNoise() {
        System.out.println("Wooof!");
    }
    public void display()
    {
        System.out.println(this.name + " is a dog ");
        makeNoise();
    }
}
