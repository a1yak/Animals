package Animals;

public class Cat extends Animals{
    private int age;
    public void eat(String food)
    {
        System.out.println("Cat eats "+ food);
    }
    public void sleep()
    {
        System.out.println("Dog is sleeping...");
    }

    public Cat(String location, String food, int age, String name) {
        super(location, food, name);
        this.age=age;
    }
    public void makeNoise() {
        System.out.println("Meoow!");

    }
    public void display()
    {
        System.out.println(this.getName() + " is a cat ");
        makeNoise();
    }
}
