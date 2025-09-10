package Kalkulator;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        KalkulatorConsole Kalkulator = new KalkulatorConsole();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Masukkan angka Pertama: ");
            int a = scanner.nextInt();
            System.out.print("Masukkan angka Kedua: ");
            int b = scanner.nextInt();
            System.out.print("Pilih Operasi: 1.Tambah 2.Kurang 3.Kali 4.Bagi : ");
            int operasi = scanner.nextInt();
            switch(operasi){
                case 1:
                    System.out.println("Hasil : " + Kalkulator.tambah(a, b));
                    break;
                case 2:
                    System.out.println("Hasil : " + Kalkulator.kurang(a, b));
                    break;
                case 3:
                    System.out.println("Hasil : " + Kalkulator.kali(a, b));
                    break;
                case 4:
                    System.out.println("Hasil : " + Kalkulator.bagi(a, b));
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
            System.out.print("Apakah ingin menghitung lagi? (y/n) : ");
            char question = scanner.next().charAt(0);
            if(question == 'n' || question == 'N'){
                System.out.println("Terima Kasih");
                break;
            }
        }while(true);
        scanner.close();
    }   
}