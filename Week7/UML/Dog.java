package UML;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        System.out.println("Class Dog.....");
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Auuuuuuuuuu........................");
    }

    @Override 
    public String toString(){
        return "Class Dog...........";
    }
}
