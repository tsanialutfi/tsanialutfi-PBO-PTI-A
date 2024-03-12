package nomor9;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswaA = new Mahasiswa("Mahasiswa A", 100);
        NoteBook notebook = new NoteBook(50, 200);

        int hari = notebook.hitungHariUntukMengisiNotebook(mahasiswaA);
        System.out.println("Mahasiswa  akan mengisi buku dalam " + hari + " hari.");
    }
}
