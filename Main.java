package Animals;

public class Main {
    public static void main(String[] args)
    {
       Animals[] animals = new Animals[3];
       Vet vet =new Vet();
       animals[0]= new Cat("Mozyr","Potato",10, "Mika");
       animals[1]=new Dog("Bryansk", "Fish", "super angry", "Albert");
       animals[2] = new Horse("Jytomir", "cucumbers", "Gnidaya", "Frederick");
       for(Animals a : animals)
       {
           a.display();
           vet.treatAnimal(a);
       }
    }
}
