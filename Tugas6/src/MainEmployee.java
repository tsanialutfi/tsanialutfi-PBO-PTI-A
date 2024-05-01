public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);

        System.out.println("nama boss : "+ boss.getName()+" salary = "+boss.getSalary());
        System.out.println("nama staff : "+staff.getName()+" salary = "+staff.getSalary());
    }
}

//Data dan Analisis hasil Percobaan
//1. Jalankan code program diatas dan benahi jika menemukan kesalahan!
//   Jawab : Tidak ada kesalahan pada kode program
//2. Bagaimana cara konstruktor pada subclass memanggil konstruktor di superclass nya?
//   Apakah hal itu perlu dilakukan? Sertakan alasam amda!
//   Jawab : Caranya dengan menambahkan extends pada subclass
//           Iya,hal itu perlu dilakukan
//           Hal itu perlu dilakukan supaya subclass terhubung dengan superclass
// 3. Tambahkan constructor pada class Employee dengan parameter String name!
//    amati perubahan apa yang terjadi,jelaskan jawaban anda!
//    Jawab : Setelah saya menambhakan constructor pada class Employee dengan parameter String name
//           tidak ada eror terjadi karena tidak ada constructor dengan nama dan isi parameter yang sama
//4. Pada class Manager baris ke 5, setelah variable day tambahkan variabel bonus!
//   amati apa yang terjadi dan mengapa demikian?
//   Jawab : Setelah saya mencoba untuk menambahkan variabel bonus terjadi eror
//          Karena variabel bonus tidak di deklarasikan sebagai parameter di dalam konstruktor Manager
// 5. Untuk apa digunakan keyword this ppada class manager dan employee? 
//    Hapus keyword this dan amati apa yang terjadi?
//    Jawab : Keyword this digunakan untuk menandakan bahwa variabel tersebut variabel parameter lokal yang terdapat di dalam konstruktor
//           Serta digunakan untuk membedakan variabel lokal tersebut dengan variabel atribut   
//           Ketika keyword this dihapus maka seperti mengartikan tidak ada perbedaan variabel
//           Contohnya, pada method overloading setBonus ketika keyword this dihapus, bonus yang di dapat boss bertambah sebesar 5000
//           setelah di jalankan bonus yang di dapat boss tidak bertambah  
//           Keywords this juga digunakan supaya dapat diubah - ubah 
// 6. Tambahkan constructor pada class Employe dengan parameter bertipe data String bernama name 
//    yang nantinya bila constructor ini akan dipanggil akan menginisialisasi variable name! 
//    amati perubahannya pada class anak dan jelaskan! benahi jika terjadi kesalahan!
//    Jawab : Setelah saya menambahkan constructor pada kelas Employee tidak terjadi eror
//           karena tidak ada constructor yang sama tipe data nya atau parameternya
// 7. Pada  bab  sebelumnya  anda  telah  belajar  mengenai  konsep  encapsulation,  
//    jelaskan mengapa  pada  super  class  menggunakan  modifier  protected? 
//    Apa  yang  terjadi  jika modifier anda ubah menjadi private atau public? Jelaskan ! 
//    Jawab : Jika modifier diganti menjadi private maka modifire tersebut hanya dapat diakses di kelas tersebut
//            Dan jika modifier diganti menjadi public maka modifier tersebut memiliki sifat yang sama dengan modifier protected
//            dapat di akses di semua sub class
// 8.Ubahlah acces modifier method pada kelas employee menjadi : 
//   a. Private 
//   b. Protected 
//   Amati perubahan apa yang terjadi? Jelaskan jawaban anda dengan detail!  
//   Jawab : a. jika modifire diganti menjadi private maka modifire tersebut tidak dapat dipanggil di class lainnya
//           b. Jika modifire diganti menjadi protected maka modifire tersebut masih dapat di akses di kelas lainnya
    