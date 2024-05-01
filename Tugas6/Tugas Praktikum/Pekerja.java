import java.time.LocalDate;
public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate thMasuk;
    private int jumlahAnak;

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getThMasuk() {
        return thMasuk;
    }
    public void setThMasuk(LocalDate thMasuk) {
        this.thMasuk = thMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    public Pekerja(){}

    public Pekerja(double gaji, LocalDate thMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, jenisKelamin, nik, menikah);
        this.gaji =gaji;
        this.thMasuk = thMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public int getLamaKerja(){
        int thnSekarang = LocalDate.now().getYear();
        int LamaKerja = thnSekarang - thMasuk.getYear();
        return LamaKerja;
    }

    public double getBonus(){
        double bonus = 0.0;
        if (getLamaKerja()<6) {
            bonus = getGaji()*0.05;
        }else if (getLamaKerja() >= 5 && getLamaKerja() <= 10){
            bonus = getGaji()*0.1;
        }else if(getLamaKerja() > 10){
            bonus = getGaji()*0.15;
        }
        return bonus;
    }

    public double getTunjanganAnak(){
        double tunjAnak = 0.0;
        if (jumlahAnak > 0) {
            tunjAnak = jumlahAnak*20;
        }else{
            tunjAnak = 0;
        }
        return tunjAnak;
    }

    public double getPendapatanAkhir(){
        double pendAkhir = getGaji() + getBonus() + getTunjanganAnak()+ super.getPendapatanManusia();
        return pendAkhir;
    }

    public String display(){
        return "Nama : " + getNama() + " NIK : " + getNik()+ " Jenis Kelamin : " + getJenisKelamin() + " Total Pendapatan : " + getPendapatanAkhir() + " Tahun Masuk : " + getThMasuk() + " Status : " + super.getMenikah() + " Jumlah Anak : " + getJumlahAnak() + " Gaji : $" + getGaji(); 
    }
    
}
