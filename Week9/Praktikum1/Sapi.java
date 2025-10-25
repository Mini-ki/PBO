package Praktikum1;

public class Sapi extends Hewan{
    
    public Sapi(String nama, int jumlahKaki, boolean bisaTerbang){
        super(nama, jumlahKaki, bisaTerbang);
    }

    @Override
    public void bersuara(){
        System.out.println("Moooooooo.....");
    }
}