package Tugas2.235150601111011-tsania.Analisis Percobaan;

public class MainMobil {
    public static void main(String[] args) {
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1234 UA");
        m1.setWarna("Merah");
        m1.displayMessage();
        System.out.println("================");

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubitshi");
        m2.setNoPlat("N 1221 AG");
        m2.setWarna("Pink");
        m2.displayMessage();
        System.out.println("================");

        //merubah warna objek m1
        System.out.println("Mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        //menampilkan hasil
        m1.displayMessage();
    }
    
}
