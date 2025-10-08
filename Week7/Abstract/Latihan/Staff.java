package Abstract.Latihan;

public class Staff extends Employ{

    public Staff(String name, int salary){
        super(name, salary);
    }

    public int calculateBonus(){
        return super.getSalary() + 200000;
    }
}
