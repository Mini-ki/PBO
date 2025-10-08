package Abstract.Latihan;

public class Main {
    public static void main(String[] args) {
        Manager Jyee = new Manager("I Nyoman Swardi Jaya Putra", 20000000);
        Staff Mutia = new Staff("Baiq Mutia Edelwis", 5000000);

        System.out.println(Jyee.getName() + ": " + Jyee.calculateBonus());
        System.out.println(Mutia.getName() + ": " + Mutia.calculateBonus());
    }
}
