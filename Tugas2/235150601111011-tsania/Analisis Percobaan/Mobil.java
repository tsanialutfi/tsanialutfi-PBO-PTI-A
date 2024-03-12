public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;


    public void setNoPlat(String s){
        this.noPlat = noPlat;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan =(int)rubahKecepatan(i) ;
    }
    //jawaban nomor 4
    public void setWaktu(double waktu){
        rubahSekon(waktu);
    }
    //jawaban nomor 5
    private void rubahSekon(double waktu){
        this.waktu = waktu * 3600;
    }
    //jawaban nomor 6
    private double rubahKecepatan(int kecepatan){
        double rubahKecepatan = (double)kecepatan;
        return rubahKecepatan = (rubahKecepatan*10)/36;
    }
    //jawaban nomor 7
    private double hitungJarak(double kecepatan, double waktu){
        double jarak = kecepatan * waktu;
        return jarak;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memiliki warna "+warna);
        //jawaban nomor 8
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        //implementasi method hitungJarak
        System.out.println("Mobil anda telah menempuh jarak sejauh " + hitungJarak(kecepatan, waktu));
    }
}

//Jawaban pertanyaan Analisis Percobaan
// 1. Apa yang dinamakan variabel instance dan lokal variable?Jelaskan perbedaannya!
//      Jawab :
//       Variable instance merupakan variabel yang yang bukan sebuah variable baru,melainkan sebuah variable yang di panggil dari sebuah class lain dengan hanya menambahkan kata new sebelum nama variabel yang di panggil
//       Variabel Lokal merupakan variabel dimana variabel tersebut masih terdapat dari sebuah method yang sama
//       Jadi,untuk perbedaan antara variabel instance dan variabel lokal adalah variabel instace merupakan variabel yang bisa saja berasal dari class atau method yang lain,sedangkan variabel lokal berasal dari sebuah method yang sama
//
// 2. Lakukan Percobaan diatas dan benahi jika menemukan kesalahan!
//    Jawab:
//      Setelah dilakukan percobaan tidak terdapat kesalahan pada kode program