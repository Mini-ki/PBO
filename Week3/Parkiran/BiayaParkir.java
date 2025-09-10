package Parkiran;

public class BiayaParkir {
    
    public int biaya (String jenisKendaraan){

        if(jenisKendaraan.equalsIgnoreCase("Mobil")){
            return 5000;
        }
        else if(jenisKendaraan.equalsIgnoreCase("Motor")){
            return 2000;
        }
        else {
            return 0;
        }
    }
}
