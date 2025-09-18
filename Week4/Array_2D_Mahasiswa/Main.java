package Array_2D_Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Perhitungan Matematis = new Perhitungan();

        String[][] dataMahasiswa = {
            {"A001", "Budi", "Pemrograman", "85"},
            {"A002", "Siti", "Pemrograman", "78"},
            {"A001", "Budi", "Basis Data", "90"},
            {"A003", "Andi", "Pemrograman", "88"},
            {"A002", "Siti", "Basis Data", "82"},
            {"A003", "Andi", "Basis Data", "75"}
        };

        for(int i = 0; i < dataMahasiswa.length; i++){
            System.out.println("NIM: " + dataMahasiswa[i][0] + ", Nama: " + dataMahasiswa[i][1] + ", Mata Kuliah: " + dataMahasiswa[i][2] + ", Nilai: " + dataMahasiswa[i][3]);
        }

        System.out.println("\nRata-rata nilai Budi: " + Matematis.mean("Budi", dataMahasiswa));
        System.out.println("Rata-rata nilai Budi: " + Matematis.mean("Siti", dataMahasiswa));
        System.out.println("Rata-rata nilai Budi: " + Matematis.mean("Andi", dataMahasiswa));

        System.out.println("\nNilai Tertinggi Budi: " + Matematis.max("Andi", dataMahasiswa));
        System.out.println("Nilai Tertinggi Budi: " + Matematis.max("Budi", dataMahasiswa));

        Matematis.searchMaxMean(dataMahasiswa);
    }
}
