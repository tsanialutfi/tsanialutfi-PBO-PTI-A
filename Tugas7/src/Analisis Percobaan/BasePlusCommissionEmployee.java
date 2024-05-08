import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;//gaji pokok tipa minggu

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary){
        super (name,noKTP, sales, rate);
    }

    //nomor 4
    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales,double rate){
        super(name,noKTP,tanggalLahir,sales,rate);
    }

    public double earnings (){
        return getBaseSalary()+ super.earnings();
    }

    public String toString(){
        return String.format("Base - Salaried "+super.toString()+ "\nbase salary "+getBaseSalary());
    }

    //nomor 4
    public double calculateSalary(){
        return super.calculateSalary() + baseSalary;
    }
    
}
