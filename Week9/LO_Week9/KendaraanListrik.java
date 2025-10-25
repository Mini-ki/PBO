package LO_Week9;

public abstract class KendaraanListrik implements KonsumsiEnergi{
    private String nama;
    protected double kapasitasBaterai;
    protected double dayaSaatIni;
    protected double kecepatanPengisian;

    public KendaraanListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        this.nama = nama;
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    public String getNama(){
        return this.nama;
    }

    
    public abstract double hitungWaktuPengisian();

    public double hitungEnergiDibutuhkan(){
        return this.kapasitasBaterai - this.dayaSaatIni;
    }
}
