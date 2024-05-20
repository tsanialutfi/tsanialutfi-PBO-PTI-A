import java.util.Scanner;

public class MainMain {
    public static void main(String[] args) { 
 
        Rectangle kotak1 = new Rectangle("merah"); 
        Rectangle kotak2= new Rectangle(); 
        Rectangle kotak3 = new Rectangle(); 
        kotak1.howToColor(); 
        kotak2.howToColor(); 
        kotak3.compareTo(4); 
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan warna kotak 1: ");
        String warnaKotak1 = scanner.nextLine();
        Rectangle k1 = new Rectangle(warnaKotak1);

        Rectangle k2 = new Rectangle();

        System.out.print("Masukkan kategori kotak 3: ");
        int kategoriKotak3 = scanner.nextInt();
        Rectangle k3 = new Rectangle();
        k3.kategori = kategoriKotak3;

        scanner.close();

        k1.howToColor();
        k2.howToColor();
        k3.compareTo(kategoriKotak3);
        
        Manusia M1 = new Manusia("Tsania", 18); // jawaban nomor 6
        M1.DisplayManusia();

        Manusia M2 = new Manusia("Febry", 20); // jawaban nomor 8
        M2.DisplayManusia(); 
        M2.Makan();
    }
}

//Jawab :
// 1. Lakukan percobaan diatas dan benahi jika menemukan kesalahan serta jelaskan! 
//    Jawab :
//    Tidak ada kesalahan ketika saya menjalankan class tersebut
// 2. Apakah class yang berbentuk Interface bisa diinstansiasi menjadi sebuah objek? Jelaskan alasannya!
//    Jawab :
//    Class interface tidak dapat diintansi menjadi sebuah objek karena class interface hanya berisi method tanpa implementasi
// 3. Apakah  suatu  class  dapat  mengimplementasi  class  interface  yang  jumlahnya  lebih  dari satu? Jelaskan alasannya!
//    Jawab :
//    Suatu class dapat mengimplementasikan class interface lebih dari satu yang biasa disebut dengan multiple interface implementation
//    karena class interface hanya berisi sebuah method
// 4. Pada interface Identitas.java hapus method  tampilkan nama, amati apa yang terjadi dan mengapa demikian? 
//    Jawab :
//    Setelah saya melakukan percobaan,terjadi eror pada class manusia karena class manusia mengimplenetasi class identitas
// 5. Jika pada class hewan kita hanya ingin mengimplements interface MakhlukHidup saja apa yang terjadi? Jelaskan
//    Jawab :
//    Ketika keywoard untuk mengimplementasi class identitas pada class hewan,tidak terjadi eror sama sekali
// 6. Buatlah konstruktor pada manusia dengan parameter umur dan nama kemudian panggil pada Class Main 
//    dengan menginstan objek bernama nama anda!
//    Jawab :
//  
// 7. Ubah  source  code  diatas  menjadi  proses  meminta  inputan  dari  user  dan  buat  menjadi interaktif!
//    Jawab :
//
// 8. Buat objek selain objek diatas dengan menggunakan method yang berbeda dengan yang diatas! (min.1 contoh)
//    Jawab :
