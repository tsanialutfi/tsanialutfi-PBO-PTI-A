public abstract class Kue {   
    private String nama;   
    private double harga;  

    public Kue(String nama, double harga) {       
        this.nama = nama;       
        this.harga = harga;   
    }  
     
    public String getNama() {       
        return this.nama;   
    }   
    public double getHarga() {       
        return this.harga;   
    }   
    
    abstract public double hitungHarga();   
    public String toString() {       
        return "Nama Kue\t\t: " + this.nama + "\nHarga Kue\t\t: " + this.harga;   
    }
}
