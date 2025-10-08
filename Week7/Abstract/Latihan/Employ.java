package Abstract.Latihan;

public abstract class Employ {
    private String name;
    private int salary;

    public Employ(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public abstract int calculateBonus();

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
