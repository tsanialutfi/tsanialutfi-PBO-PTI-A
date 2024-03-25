public class Koki {
    private String nama;
    private int usia;
    private boolean jenisKelamin;
    private String jabatan;
    private String spesialis;

    
    public Koki(String nama, int usia, boolean jenisKelamin, String jabatan, String spesialis) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.spesialis = spesialis;
    }

    public void main() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Spesialis : " + spesialis);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }

    
    public void memasak() {
        System.out.println("Sedang Memasak");
    }

    public void menyiapkan(String bahanMakanan) {
        System.out.println("Menyiapkan " + bahanMakanan);
    }

    public void monitor(String peralatanMemasak) {
        System.out.println("Monitoring " + peralatanMemasak);
    }
}
