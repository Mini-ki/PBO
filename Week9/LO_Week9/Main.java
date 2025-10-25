package LO_Week9;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        ArrayList <KendaraanListrik> listKendaraan = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.####");

        KendaraanListrik mobil1 = new MobilListrik("Mobil Listrik", 80, 20, 10);
        listKendaraan.add(mobil1);

        MotorListrik motor1 = new MotorListrik("Motor Listrik", 30, 10, 5);
        listKendaraan.add(motor1);

        MobilListrik mobil2 = new MobilListrik("Mobil Listrik", 60, 45, 12);
        listKendaraan.add(mobil2);

        MotorListrik motor2 = new MotorListrik("Motor Listrik", 25, 20, 4);
        listKendaraan.add(motor2);

        for(KendaraanListrik listK : listKendaraan){
            System.out.println(listK.getNama() + " --> " + " Waktu: " + df.format(listK.hitungWaktuPengisian()) + " Jam, Energi: " + df.format(listK.hitungEnergiDibutuhkan()) + " kWh");
        }


    }
}