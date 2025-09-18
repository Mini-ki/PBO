package Array_2D_Negara;

public class Main {
    public static void main(String[] args) {
        String[][] negaraIbuKota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Amerika", "Washington DC"}
        };

        for(int i = 0; i < negaraIbuKota.length; i++){
            System.out.println("IbuKota " + negaraIbuKota[i][0] + " adalah " + negaraIbuKota[i][1]);
        }
    }
}