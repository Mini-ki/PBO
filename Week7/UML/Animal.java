package UML;

public class Animal{
    private String name;
    private int age;

    public Animal(){
        System.out.println("Constructor Animal.......");
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal......");
    }

    public String toString(){
        return "Class Animal......";
    }
}