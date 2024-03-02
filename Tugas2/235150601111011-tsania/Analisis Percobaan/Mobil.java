public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memiliki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
    }
}

//Jawaban pertanyaan Analisis Percobaan
// 1. Apa yang dinamakan variabel instance dan lokal variable?Jelaskan perbedaannya!
//      Jawab :
//       Variable instance merupakan variabel yang yang bukan sebuah variable baru,melainkan sebuah variable yang di panggil dari sebuah class lain dengan hanya menambahkan kata new sebelum nama variabel yang di panggil
//       Variabel Lokal merupakan variabel dimana variabel tersebut masih terdapat dari sebuah method yang sama
//       Jadi,untuk perbedaan antara variabel instance dan variabel lokal adalah variabel instace merupakan variabel yang bisa saja berasal dari class atau method yang lain,sedangkan variabel lokal berasal dari sebuah method yang sama
//