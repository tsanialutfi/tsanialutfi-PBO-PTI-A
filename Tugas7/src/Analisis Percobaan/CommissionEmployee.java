import java.time.LocalDate;

public class CommissionEmployee extends Employee{
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public CommissionEmployee(String name,String noKTP, double sales, double rate){
        super(name,noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    //nomor 4
    public CommissionEmployee(String name, String noKTP, LocalDate tanggalLahir,double sales,double rate){
        super(name,noKTP,tanggalLahir);
        setCommissionRate(rate);
        setGrossSales(sales);
    }

    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("Commision employee : "+super.toString()+"\ngross sales : "+getGrossSales()+"\ncommission rate "+getCommissionRate());
    }

    //abstract method nomor 4
    @Override
    public double calculateSalary(){
        return grossSales + (grossSales * commissionRate / 100);
    }
}
