package Percabangan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();

        do{
            System.out.print("Masukkan Nilai: ");
            int nilai = scanner.nextInt();

            System.out.println("Grade: " + grade.getGrade(nilai));
            grade.lulus(nilai);
            
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
