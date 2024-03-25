public class Lingkaran {
    int alas, tinggi;
    
    public Lingkaran(int alas){
        this.alas = alas;
    }

    public Lingkaran (int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //jawaban nomor 2
    // public Lingkaran(int tinggi){
    //     this.tinggi = tinggi;
    // }

    //jawaban nomor 3
    public Lingkaran(String alas, String tinggi){
        this.alas = parseInt(alas);
        this.tinggi = parseInt(tinggi);
    }
    private int parseInt(String value){
        try{
            return Integer.parseInt(value);
        }catch(NumberFormatException e){
            System.out.println("Parsing value tidak sesuai : " + value);
            return 0;
        }
    }

    public void setAlas(int alas){
        this.alas = alas;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public double hitungLuas(){
        double hasil = (double) (getTinggi()*getAlas())/2;
        return hasil;
    }

    public void displayMessage(){
        System.out.println("Hitung Luas : " + hitungLuas());
    }

    
}


//Jawaban
//1. Lakukan percobaan diatas dan benahi jika menemukann kesalahan!
//   Jawab : Setelah dilakukan percobaan tidak ada kesalahan 

//2. Pada kelas lingkaran tambahkan contructor dengan parameter int tinggi,
//   apa yang terjadi dan jelasskan!
//   Jawab : Setelah di tambahkan constructor dengan parameter int tinggi terjadi eror
//           karena parameter tersebut sama dengan parameter pada constructor lain

