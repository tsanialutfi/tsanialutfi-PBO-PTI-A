public class Athlet {
    private String nama;
    private int usia;
    private String namaCabor;
    private int beratBadan;
    private boolean jenisKelamin;

    //Constructor overloading
    public Athlet(String nama, int usia, String namaCabor, int beratBadan, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.namaCabor = namaCabor;
        this.beratBadan = beratBadan;
        this.jenisKelamin = jenisKelamin;
    }

    public Athlet(){
        nama = "Farhan Halim";
        usia = 24;
        namaCabor = "Bola Voli";
        beratBadan = 70;
        jenisKelamin = true;
    }

    public Athlet(String namaCabor, boolean jenisKelamin){
        this.namaCabor = namaCabor;
        this.jenisKelamin = jenisKelamin;
        nama = "Gresya Polii";
        usia = 27;
        beratBadan = 68;
    }

    //Method overloading
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

    //Instan Method
    void pertandingan(){
        System.out.println("Setelah melakukan pertandingan");
    }
}
