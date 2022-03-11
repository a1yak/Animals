package Animals;

public abstract class Animals
{
    private String name;
    private String food;
    private String location;
    public void makeNoise()
    {
System.out.println("Some noise...");
    }

    public String getName() {
        return name;
    }

    public Animals(String location, String food, String name)
    {
        this.location = location;
        this.food = food;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public abstract void sleep();
    public abstract  void display();
    public abstract void eat(String food);

}
