package Abstract.Latihan;

public class Manager extends Employ {

    public Manager(String name, int salary){
        super(name, salary);
    }

    public int calculateBonus(){
        return super.getSalary() + 500000;
    }
}
