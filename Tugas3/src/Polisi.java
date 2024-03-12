public class Polisi {
    private String nama;
    private boolean jenisKelamin;
    private String pangkat;
    private int usia;
    private String tempatDinas;
 
    public Polisi(String nama, boolean jenisKelamin, String pangkat, int usia, String tempatDinas) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.pangkat = pangkat;
        this.usia = usia;
        this.tempatDinas = tempatDinas;
    }
    
    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Pangkat: " + pangkat);
        System.out.println("Tempat Dinas: " + tempatDinas);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }
    public void patroliMalam(int jam) {
        System.out.println(nama + " sedang melakukan patroli malam pada jam " + jam);
    }
 
    public void operasiLaluLintas(String jalan) {
        System.out.println("Polisi " + nama + " sedang melakukan operasi lalu lintas di jalan " + jalan);
    }
 
    public void pelayananMasyarakat() {
        System.out.println("Polisi " + nama + " sedang melayani masyarakat");
    }
}
