import java.time.LocalDate;

public abstract class Employee{
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;//jawaban no 4

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public Employee(String name,String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    //constructor no 4
    public Employee(String name,String noKTP, LocalDate tanggalLahir){
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }

    public String toString(){
        return String.format("  "+getName()+"\nNo.KTP : "+getNoKTP());
    }

    public abstract double earnings();//pendapatan

    //accesor dan mutator no 4
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    //program tambahan gaji di bulan ulang tahun nomor 4
    public double getBirthdayBonus() {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() == tanggalLahir.getMonthValue() && today.getDayOfMonth() == tanggalLahir.getDayOfMonth()) {
            return 100000;
        } else {
            return 0;
        }
    }
    public static boolean isBulanUlangTahun(LocalDate tanggalLahir) {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == tanggalLahir.getMonthValue() && now.getDayOfMonth() == tanggalLahir.getDayOfMonth();
    }

    public abstract double calculateSalary();
    
}