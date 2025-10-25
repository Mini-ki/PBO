package Praktikum2;

public class Main {
    public static void main(String[] args) {
        Duck Duck = new Duck("Duck");
        Dog Dog = new Dog("Dog");

        Duck.makeSound();
        Duck.eat();
        Duck.swim();
        Duck.fly();

        System.out.println("---------------------");

        Dog.makeSound();
        Dog.eat();
        Dog.swim();
    }
}
