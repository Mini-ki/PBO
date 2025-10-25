package LO_Week9;

public class MotorListrik extends KendaraanListrik{
    
    public MotorListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    public double hitungWaktuPengisian(){
       return ((super.kapasitasBaterai - super.dayaSaatIni)/super.kecepatanPengisian) * 1.05;
    }

}
