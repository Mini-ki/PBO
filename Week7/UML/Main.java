package UML;

public class Main {
    public static void main(String[] args) {
        Dog MiniPom = new Dog("Ciko", 1, "MiniPom");
        Dog Husky = new Dog("Nowy", 2, "Husky");

        MiniPom.makeSound();
        System.out.println(MiniPom.getName());
        System.out.println(Husky.getBreed());
    }
}
