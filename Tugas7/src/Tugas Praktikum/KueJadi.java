public class KueJadi extends Kue {   
    private double jumlah;   
    
    public KueJadi(String nama, double harga, double jumlah) {       
        super(nama, harga);       
        this.jumlah = jumlah;   
    }   
    
    public double getJumlah() {       
        return this.jumlah;   
    }   
    
    @Override   
    public double hitungHarga() {       
        return this.jumlah * super.getHarga() * 2;   
    }   
    
    @Override   
    public String toString() {       
        return super.toString() + "\nJumlah Kue\t\t: " + this.jumlah + "\nTotal Harga\t\t: " + hitungHarga() + "\nJenis Kue\t\t: Kue Jadi";   
    }
}
