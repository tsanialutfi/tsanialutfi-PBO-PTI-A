package nomor9;

public class NoteBook {
    private int jumlahLembar;
    private int kataPerLembar;

    public NoteBook(int jumlahLembar, int kataPerLembar) {
        this.jumlahLembar = jumlahLembar;
        this.kataPerLembar = kataPerLembar;
    }

    public int getJumlahLembar() {
        return jumlahLembar;
    }

    public void setJumlahLembar(int jumlahLembar) {
        this.jumlahLembar = jumlahLembar;
    }

    public int getKataPerLembar() {
        return kataPerLembar;
    }

    public void setKataPerLembar(int kataPerLembar) {
        this.kataPerLembar = kataPerLembar;
    }

    public int hitungHariUntukMengisiNotebook(Mahasiswa mahasiswa) {
        int totalKata = jumlahLembar * kataPerLembar;
        int hari = totalKata / mahasiswa.getJumlahKataPerHari();
        return hari;
    }
}
