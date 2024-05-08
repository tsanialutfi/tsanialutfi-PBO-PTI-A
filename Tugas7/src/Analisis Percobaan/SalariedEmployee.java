import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double weeklySalary;//gaji/minggu
    private double monthSalary;//gaji / bulan no 4

    //aceccor mutator no 4
    public double getMonthSalary() {
        return monthSalary;
    }
    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }
    //method gaji per bulan
    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir ,double monthSalary){
        super(name, noKTP, tanggalLahir);
        setMonthSalary(monthSalary);
    }

    public SalariedEmployee(String name, String noKTP, double salary){
        super(name,noKTP);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public double earnings(){
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("Salaried Employee : "+ super.toString()+ "\nweekly salary : "+getWeeklySalary());
    }

    //nomor 4
    // public double earnings(){
    //     return monthSalary + getBirthdayBonus();
    // }

    //abstract method nomor 4
    @Override
    public double calculateSalary(){
        return monthSalary;
    }
}
