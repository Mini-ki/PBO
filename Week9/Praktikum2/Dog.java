package Praktikum2;

public class Dog extends Animal implements Swimmable{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Gukkk....Gukkk....");
    }

    @Override
    public void swim(){
        System.out.println("Swim......");
    }
}
