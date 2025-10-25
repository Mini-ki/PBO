package Praktikum1;

public class Burung extends Hewan{
    
    public Burung(String nama, int jumlahKaki, boolean bisaTerbang){
        super(nama, jumlahKaki, bisaTerbang);
    }

    @Override
    public void bersuara(){
        System.out.println("Gakkkk Gakkkkkk");
    }
}
