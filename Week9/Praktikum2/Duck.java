package Praktikum2;

public class Duck extends Animal implements Flyable, Swimmable{

    public Duck(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Wekkkkk...... Wekkkk.....");
    }

    @Override
    public void fly(){
        System.out.println("Flyy......");
    }

    @Override
    public void swim(){
        System.out.println("Swim.......");
    }
}
