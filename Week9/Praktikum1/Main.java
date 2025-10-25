package Praktikum1;

public class Main {
    public static void main(String[] args) {
        Hewan Gagak = new Burung("Gagak", 2, true);
        Hewan Sapi = new Sapi("Sapi", 4, false);

        Gagak.isHewan();
        Gagak.bersuara();

        Sapi.isHewan();
        Sapi.bersuara();
    }
}
