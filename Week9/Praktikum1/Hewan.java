package Praktikum1;

public abstract class Hewan {
    private String nama;
    private int jumlahKaki;
    private boolean bisaTerbang;

    public Hewan(String nama, int jumlahKaki, boolean bisaTerbang){
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void isHewan(){
        System.out.println("Nama Hewan: " + this.nama + "\nJumlah Kaki: " + this.jumlahKaki);
        // System.err.println("Bisa Terbang: " + (this.bisaTerbang ? "Ya" "Tidak"));
        if(this.bisaTerbang){
            System.out.println("Bisa Terbang: Ya");
        }
        else{
            System.out.println("Bisa Terbang: Tidak");
        }
    }

    public abstract void bersuara();
}