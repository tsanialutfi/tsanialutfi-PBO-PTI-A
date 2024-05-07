package source.pertemuan10.studcase1;

abstract class Civitas {
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public Civitas(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = true;
    }

    abstract public void masukKelas();

    public void mainGameCorner(int TV) {
        System.out.println(nama + " sedang bermain pada TV " + TV);
    }
}

class Mahasiswa extends Civitas {
    public String getNIM() {
        return NIM;
    }
    public double getIPK() {
        return IPK;
    }
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    public void masukKelas () {
        System.out.println(getNama() + " sedang menyimak kelas ");
    }

    void masukKelas (String mataKuliah) {
        System.out.println(getNama() + " sedang menyimak kelas " + mataKuliah);
    }

    void masukKelas (int jumlahTeman) {
        System.out.println(getNama() + " sedang berbincang dengan " + jumlahTeman + " orang");
    }

    @Override    
    public void mainGameCorner(int TV) {
        System.out.println(getNama() + " sedang bermain pada TV " + TV + " bareng temannya");
    }
}

class Dosen extends Civitas {
    public String getNIDN() {
        return NIDN;
    }
    private String NIDN;

    public Dosen(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur);
    }

    public void masukKelas () {
        System.out.println(getNama() + " sedang mengajar materi");
    }

    @Override
    public void mainGameCorner(int TV) {
        System.out.println(getNama() + " sedang bermain pada TV " + TV + " bersama anaknya");
    }
}

class Asprak extends Mahasiswa {
    private String mataKuliah;

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mk) {
        mataKuliah = mk;
    }

    public Asprak(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    @Override
    public void masukKelas () {
        System.out.println(getNama() + " sedang mengajar " + mataKuliah);
    }
}

public class Main {
    /*
     * Typecasting object hanya bisa dilakukan apabila sebuah 
     * instans/objek merupakan instanceof / is a dari class yang ingin kita casting
     */
    public static void main(String[] args) {
        Dosen buRetno = new Dosen("Bu Retno", 30, false);
        Mahasiswa aldo = new Mahasiswa("Aldo", 20, true);
        buRetno.getNIDN();

        // upcasting explisit
        Civitas buRetnoCivitas = (Civitas)buRetno;
        Civitas aldoCivitas = (Civitas)aldo;
        buRetnoCivitas.masukKelas();
        aldoCivitas.masukKelas();
        // buRetnoCivitas.getNIDN(); error

        // upcasting implisit
        Civitas dono = new Mahasiswa("Dono", 20, true);
        // dono.getNIM() // gabisa mengakses attribut/method yang ada pada class Mahasiswa
        // tapi dia akan menggunakan implementasi dari method yang dioverride pada class Mahasiswa
        dono.mainGameCorner(4);

        Mahasiswa devon = new Asprak("Devon", 20, true);
        Mahasiswa lutfi = new Mahasiswa("Lutfi", 21, true);

        // downcasting 
        // hanya bisa dilakukan apabila objek tersebut merupakan instanseof subclass tersebut
        Mahasiswa donoMahasiswa = (Mahasiswa)dono;
        donoMahasiswa.mainGameCorner(3);

        Asprak adit = new Asprak("Adit", 20, true);
        // Asprak ryo = new Mahasiswa("Ryo", 20, true); // error

        System.out.println("Aldo  Instanseof Civitas : " + (aldo instanceof Civitas));
        System.out.println("Devon Instanseof Asprak  : " + (devon instanceof Asprak));
        System.out.println("Lutfi Instanseof Asprak  : " + (lutfi instanceof Asprak));
        System.out.println("Adit  Instanseof Asprak  : " + (adit instanceof Asprak));
        System.out.println("Dono  Instanseof Mahasiswa  : " + (dono instanceof Mahasiswa));

        Asprak devonAsprak = (Asprak)devon;
        devonAsprak.setMataKuliah("PBO");
    }    
}


/*
 * Elvira +1
 * Amaliyah +1
 */