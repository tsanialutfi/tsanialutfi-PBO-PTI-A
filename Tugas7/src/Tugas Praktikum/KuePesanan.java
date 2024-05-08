public class KuePesanan extends Kue {   
    private double berat;   
    
    public KuePesanan(String nama, double harga, double berat) {       
        super(nama, harga);       
        this.berat = berat;   
    }   
    
    public double getBerat() {       
        return this.berat;   
    }  

    @Override   
    public double hitungHarga() {       
        return this.berat * super.getHarga();   
    }  
     
    @Override   
    public String toString() {       
        return super.toString() + "\nBerat Kue\t\t: " + this.berat + "\nTotal Harga\t\t: " + hitungHarga() + "\nJenis Kue\t\t: Kue Pesanan";   
    }
}
