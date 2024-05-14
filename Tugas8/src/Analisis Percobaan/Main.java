public class Main {
    public static void main(String[] args) {
        //casting
        //double angka = 5.4;
        //int angka_int = (int)angka;
        //System.out.println(angka_int);
        //Object dengan class HeroIntel

        HeroIntel hero1 = new HeroIntel("Ucup",100);
        hero1.display();

        //upcasting
        Hero heroUp = (Hero)hero1;
        heroUp.display();
        //System.out.println(heroUp.getType()); //ini error
        //Object dgn class Hero
        Hero heroReg = new Hero("Boy",100);
        heroReg.display();

        //downcasting
        //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        //heroDown.display();
        //heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); //ini berhasil downcasting

        //jawaban nomor 3
        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();
        HeroAgility hero4 = new HeroAgility("Lala", 100);
        hero4.display();
        HeroAgility hero3 = (HeroAgility) hero4;
        hero3.display();

        //Jawaban nomor 5
        HeroMagic hero5 = new HeroMagic("Al", 100, "90");
        hero5.display();
        //upcasting
        Hero heroU = (Hero)hero5;
        heroU.display();
        //downcasting
        HeroMagic hero6 = (HeroMagic) heroU;
        hero6.display();


    }
}
   
//Data dan analisis hasil percobaan
// 1. Jelaskan apa fungsi dari extends dan super pada kode subclass
// Jawab : Fungsi dari extends digunakan untuk menyambungkan antara subclass dengan superclass nyaa
//         Fungsi dari super digunakan untuk menginisialisasi bahsa atribut tersebut berasal dari superclassnya 
// 2. Untuk apa digunakan keyoword this pada constructor,setter dan getter?
//    Jawab : Keyword this digunakan untuk membedakan antara atribut lokal dan atribut class
//3. Tambahkan kode pada class main
//   Jawab : 
// 4. Ubahlah modifier atribut type pada class HeroIntel dan HeroAgility menjadi public, lalu coba akses
//    langsung melalui class Main. Apakah atribut bisa diakses langsung atau tidak, jelaskan!
//    Jawab :Setelah saya lakukan percobaan , atribut tetap bisa diakses karena tipr public menandakan bahwa atribut tersebut 
//           dapat diakses di semua class 
// 5.Buatlah class baru HeroMagic dengan atribut tambahan power = “Magic” serta extends semua
//   atribut dan method dari class Hero. Kemudian coba buatlah kode untuk upcasting dan downcasting
//   dari class HeroMagic ke Hero pada class Main!
//   Jawab : 
