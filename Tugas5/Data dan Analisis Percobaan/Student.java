public class Student {
    private String name;
    private int mark;

    public Student(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    public Student(String string, String string2, int i, double d, double e, double f) {
        //TODO Auto-generated constructor stub
    }

    public Student() {
        //TODO Auto-generated constructor stub
    }

    public void setName(String n){
        name=n;
    }
    // private void setName(String n){
    //     name=n;
    // }

    public String getName(){
        return name;
    } 

    public void setMark(int m){
        mark=m;
    } 

    public int getMark(){
        return mark;
    }

    public void setAddress(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAddress'");
    }

    public void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    public void setMath(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMath'");
    }

    public void setScience(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setScience'");
    }

    public void setEnglish(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEnglish'");
    }

    public void displayMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayMessage'");
    }

    public static void jmlObjek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jmlObjek'");
    }

    // public static void main(String[] args) {
    //     Student s1=new Student();
    //     s1.setName("Enkapsulasi");
    //     //s1.setMark("90");
    //     //Jawaban nomor 1
    //     s1.setMark(90);
    //     //System.out.println("s1Name is "+s1.setName());
    //     //Jawaban nomor 1 dan 2
    //     System.out.println("s1Name is "+s1.getName());
    //     //System.out.println("s1Mark is "+s1.setMark());
    //     //Jawaban nomor 1
    //     System.out.println("s1Mark is "+s1.getMark());
    //     //System.out.println("name dan mark "+name+" "+mark);
    //     //Jawaban nomor 1
    //     System.out.println("name and mark "+s1.getName() +" "+ s1.getMark());
    // }
}

// Jawaban :
// 1.Lakukan percobaan diatas dan benahi jika menemukan kesalahan! 
//   Jawab : Setelah melakukan percobaan,saya menemukan kesalahan pada kelas Test

//2.Jika pada baris 6 s1.setName diubah menjadi s1.getName apa yang terjadi? jelaskan! 
//  Jawab : Setelah dilakukan perubahan kode program yang pada awalnya eror setelahnya erornya sudah teratasi

//3.Setelah diperbaiki, ubahlah hak akses pada baris 4 (pada class Student)  menjadi private 
//  apa yang terjadi jika class Test dijalankan? Jelaskan!
//  Jawab : Setelah hak akses di ganti menjadi private , methodnya menjadi tidak terpakai dan pada class Test terjadi eror 

//4.Jika kedua kelas diatas terdapat dalam package yang sama apakah konsep enkapsulasi tetap berfungsi? jelaskan! 
//  Jawab : Masih tetap berfungsi
