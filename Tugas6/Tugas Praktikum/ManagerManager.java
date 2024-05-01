import java.time.LocalDate;
public class ManagerManager extends Pekerja{
   private String departemen;
   
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ManagerManager(){}

    public ManagerManager(String departemen, double gaji, LocalDate thMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah){
        super(gaji, thMasuk, jumlahAnak,nama,nik,jenisKelamin,menikah);
        this.departemen = departemen;
    }

    public int getLamaKerja(){
        int thnSekarang = LocalDate.now().getYear();
        int LamaKerja = thnSekarang - getThMasuk().getYear();
        return LamaKerja;
    }

    

   
}
