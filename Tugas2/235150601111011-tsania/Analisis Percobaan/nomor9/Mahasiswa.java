package nomor9;

public class Mahasiswa {
    private String nama;
    private int jumlahKataPerHari;

    public Mahasiswa(String nama, int jumlahKataPerHari) {
        this.nama = nama;
        this.jumlahKataPerHari = jumlahKataPerHari;
    }

    public int getJumlahKataPerHari() {
        return jumlahKataPerHari;
    }

    public void setJumlahKataPerHari(int jumlahKataPerHari) {
        this.jumlahKataPerHari = jumlahKataPerHari;
    }

}