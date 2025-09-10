package Parkiran;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BiayaParkir hitungBiaya = new BiayaParkir();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Masukkan jumlah hari masuk kampus: ");
            int hari = scanner.nextInt();
            scanner.nextLine();

            int totalBiaya = 0;
            for(int i = 0; i < hari; i++){
                do{
                    System.out.print("Hari ke-" + (i + 1) + "(Motor/Mobil): ");
                    String jenisKendaraan = scanner.nextLine();
                    if(hitungBiaya.biaya(jenisKendaraan) == 0){
                        System.out.println("Jenis Kendaraan Tidak Valid");
                    }
                    else{
                        totalBiaya += hitungBiaya.biaya(jenisKendaraan);
                        break;
                    }
                }while(true);
            }

            System.out.println("Total Biaya Parkir: " + totalBiaya);

            System.out.print("Apakah ingin mengulang lagi? (y/n) : ");
            char question = scanner.next().charAt(0);
            if(question == 'n' || question == 'N'){
                System.out.println("Terima Kasih");
                break;
            }

        }while(true);
        scanner.close();
    }
}
