public class Atlet {
    private String nama;
    private int usia;
    private String namaCabor;
    private int beratBadan;
    private boolean jenisKelamin;

    public Atlet(String nama, int usia, String namaCabor, int beratBadan, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.namaCabor = namaCabor;
        this.beratBadan = beratBadan;
        this.jenisKelamin = jenisKelamin;
    }

    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Nama Cabor: " + namaCabor);
        System.out.println("Berat Badan: " + beratBadan);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }

    public void latihan(String fisik) {
        System.out.println(nama + " sedang melakukan latihan " + fisik);
    }

    public void menang(int juara) {
        System.out.println(nama + " menang juara " + juara);
    }
}
