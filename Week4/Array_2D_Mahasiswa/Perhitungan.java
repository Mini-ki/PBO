package Array_2D_Mahasiswa;

public class Perhitungan {
    
    public double mean(String namaMahasiswa, String[][] dataMahasiswa){
        int counter = 0;
        double totalNilai = 0;
        for(int i = 0; i < dataMahasiswa.length; i++){
            if(dataMahasiswa[i][1].equalsIgnoreCase(namaMahasiswa)){
                counter++;
                int nilaiMahasiswa = Integer.parseInt(dataMahasiswa[i][3]);
                totalNilai += nilaiMahasiswa;
            }
        }
        return totalNilai/counter;
    }

    public int max(String namaMahasiswa, String[][] dataMahasiswa){
        int indexNilai = 0;
        for(int i = 0; i < dataMahasiswa.length; i++){
            if (dataMahasiswa[i][1].equalsIgnoreCase(namaMahasiswa)){
                indexNilai = i;
                for (int j = indexNilai + 1; j < dataMahasiswa.length; j++){
                    if (dataMahasiswa[j][1].equalsIgnoreCase(namaMahasiswa)){
                        if(Integer.parseInt(dataMahasiswa[j][3]) > Integer.parseInt(dataMahasiswa[indexNilai][3])){
                            indexNilai = j;
                        }
                    }
                }
                break;
            }
        }
        return Integer.parseInt(dataMahasiswa[indexNilai][3]);
    }

    public void searchMaxMean(String[][] dataMahasiswa){

        double maxMean = mean(dataMahasiswa[0][1], dataMahasiswa);
        int indexMean = 0;
        for(int i = 1; i < dataMahasiswa.length; i++){
            double meanTemp = mean(dataMahasiswa[i][1], dataMahasiswa);
            if(meanTemp > maxMean){
                maxMean = meanTemp;
                indexMean = i;
            }
        }

        System.out.println("Mahasiswa dengan rata-rata tertinggi adalah " + dataMahasiswa[indexMean][1] + "(" + maxMean + ")" );
    }
}
