import java.util.Scanner;
class inputConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Masukkan angka :");
        int angka = scanner.nextInt();
        System.out.println("Angka yang dimasukkan adalah : " + angka);
        scanner.close();
    }
}