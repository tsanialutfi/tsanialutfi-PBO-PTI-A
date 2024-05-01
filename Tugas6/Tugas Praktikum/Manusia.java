public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        String jk = jenisKelamin ? "Laki - laki " : "Perempuan";
        return jk;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean getMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public Manusia(){
    }

    public Manusia(String nama, boolean jk,String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jk;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan(){
        double tj = 0.0;
        if (menikah == true) {
            if (jenisKelamin == true) {
                   tj = 25;
            }else if(jenisKelamin == false){
                tj = 20;
            }  
        }else {
            tj = 15;
        }
        return tj;
    }

    public double getPendapatan(){
        double pendapatan = 0.0;
        if (jenisKelamin == true) {
            pendapatan = 0;
        }else{
            pendapatan = 0;
        }
        return pendapatan;
    }

    public double getPendapatanManusia(){
        double pendapatanManusia = getTunjangan() + getPendapatan();
        return pendapatanManusia;
    }

    public String toString(){
        return "Nama\t\t\t :" + getNama() + "\nNIK\t\t\t : " + getNik() + "\njenis Kelamin\t\t : " + getJenisKelamin() + "\nPendapatan\t\t : $ " + getPendapatanManusia();
    }
   
}
