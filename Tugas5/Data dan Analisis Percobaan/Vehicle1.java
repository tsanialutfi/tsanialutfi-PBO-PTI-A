public class Vehicle1 {
    private double load, maxLoad;
    //protected double load, maxLoad;
    
    public Vehicle1 (double max){
        this.maxLoad = max;
    }
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }else {
            return false;
        }
    }
}

//Jawaban :
//1.Method apakah yang menjadi accessor (getter) ?
//  Jawab : terdapat 2 method accessor yaitu method getLoad dan getMaxLoad

//2.Tambahkan source code berikut dibawah baris ke 6 pada class TestVehicle1. 
//  System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
//  Jalankan program, apakah output dari program tersebut?  
//  Kembalikan program seperti semula
//  Jawab : Ketika dimasukkan kode source tersebut pada class TestVehicle1 output dari program bertambah Add load(100kg) : 500.0
//          dan output pada get load bertambah 50kg menjadi Vehicle load is 9800.0kg

//3.Ubahlah tipe data pada atribut load dan maxload pada class Vehicle1 menjadi public.  
//  Jalankan program, apakah output dari program tersebut? 
//  a. Tambahkan source kode berikut dibawah baris ke 6 pada class TestVehicle1. 
//     System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
//     Jalankan program, apakah output dari program tersebut?  
//     Kembalikan program seperti semula. 
//  b. Tambahkan source kode berikut dibawah baris ke 12 pada class TestVehicle1. 
//     System.out.println("Add load(100kg) : " + (vehicle.load=500)); 
//     Jalankan program, apakah output dari program tersebut?  
//     Kembalikan program seperti semula
//  Jawab : a. Ketika dimasukkan kode source tersebut pada class TestVehicle1 output dari program bertambah Add load(100kg) : 500.0
//             dan output pada get load bertambah 50kg menjadi Vehicle load is 9800.0kg
//          b. Ketika di masukkan kode source tersebut terjadi eror karena kode tersebut tidak di dimasukkan pada kelas main

//4.Ulangi  instruksi  pada  nomer  4  dengan  mengubah  tipe  data  pada  atribut  load  dan  maxload pada class Vehicle1 menjadi protected.
//  Jawab : Setelah tipe data di ganti dengan protected menhadi eror karena atribut yang digunakan sama 

//5.Ulangi  instruksi  pada  nomer  4  dengan  mengubah  tipe  data  pada  atribut  load  dan  maxload pada class Vehicle1 menjadi default.
//  Jawab : 