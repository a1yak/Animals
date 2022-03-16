package Animals;

public abstract class Animals implements Creature
{

    protected String name;
    protected String food;
    protected String location;


    public Animals(String location, String food, String name)
    {
        this.location = location;
        this.food = food;
        this.name = name;
    }

}
