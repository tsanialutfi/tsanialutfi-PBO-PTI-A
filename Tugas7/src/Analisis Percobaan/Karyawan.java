
public class Karyawan {
    private String nama;
    private double upahPerBarang;
    private int banyaknyaBarangPerMinggu;

    public Karyawan(String nama, double upahPerBarang, int banyaknyaBarangPerMinggu) {
        this.nama = nama;
        this.upahPerBarang = upahPerBarang;
        this.banyaknyaBarangPerMinggu = banyaknyaBarangPerMinggu;
    }

    public double hitungGaji() {
        return banyaknyaBarangPerMinggu * upahPerBarang;
    }

    public String getNama() {
        return nama;
    }
}
