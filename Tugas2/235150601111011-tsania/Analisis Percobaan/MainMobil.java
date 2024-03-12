import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //instan objek bernama m3 
        //jawaban nomor 3
        Mobil m3 = new Mobil();
        System.out.println("Masukkan kecepatan mobil : ");
        m3.setKecepatan(input.nextInt());
        input.nextLine();
        System.out.println("Masukkan manufaktur mobil : ");
        m3.setManufaktur(input.nextLine());
        System.out.println("Masukkan no plat mobil : ");
        m3.setNoPlat(input.nextLine());
        System.out.println("Masukkan warna mobil : ");
        m3.setWarna(input.nextLine());
        m3.displayMessage();

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
