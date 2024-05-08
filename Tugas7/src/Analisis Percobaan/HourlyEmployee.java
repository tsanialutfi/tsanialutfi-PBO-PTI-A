import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage;//upah/jam
    private double hours;//jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP,double hourlyWage,double hoursWorked){
        super(name,noKTP);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    //nomor 4
    public HourlyEmployee(String name, String noKTP, LocalDate tanggalLahir,double hourlyWage,double hoursWorked ){
        super(name,noKTP,tanggalLahir);
        setHours(hoursWorked);
        setWage(hourlyWage);
    }

    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }
    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }
    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double earnings(){
        if (getHours()<=40) {
            return getWage()*getHours();
        }else{
            return 40 * getWage()+ (getHours()-40*getWage()*1.5);
        }
    }

    public String toString(){
        return String.format("Hourly employee : "+super.toString()+"\nhourly wage "+getWage()+"\nhours worked : "+getHours());
    }

    //nomor 4
    // public double earnings(){
    //     return hourlyWage * hoursWorked + getBirthdayBonus();
    // }

    //abstract method nomor 4
    @Override
    public double calculateSalary(){
        return wage * hours;
    }

}
