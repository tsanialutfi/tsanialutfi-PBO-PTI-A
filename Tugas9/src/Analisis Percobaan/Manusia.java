public class Manusia implements MakhlukHidup, Identitas {
    public String nama; 
    public int umur; 

    public Manusia(String nama, int umur){ //jawaban nomor 6
        this.nama = nama;
        this.umur = umur;
    }
    public void DisplayManusia(){
        System.out.println("Nama :" + nama + " Umur :" + umur);
    }
    public void Makan(){
        System.out.println(nama + " Sedang makan mie ayam");
    }
     
    @Override 
    public void makan() { 
        System.out.println("Makan pakai sendok garpu");
    } 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai dua kaki");
    } 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya merdu");
    } 
 
    @Override 
    public void tampilkanNama() { 
        System.out.println("Nama saya: " + this.nama);
    } 
 
    @Override 
    public void tampilkanUmur() { 
        System.out.println("Umur saya: " + this.umur);
    } 
}
