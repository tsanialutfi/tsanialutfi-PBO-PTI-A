public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(){}
    public MahasiswaFILKOM(String NIM, double IPK,String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.IPK = IPK;
        this.NIM = NIM;
    }

    public String getNIM(){
        return NIM;
    }

    public double getIPK(){
        return IPK;
    }
    public String getStatus(){
        String angkatan = "";
        String prodi = "";
        if(getNIM().charAt(0)=='1'){
            if(getNIM().charAt(1)=='6'){
                angkatan = "2016";
            }else if(getNIM().charAt(1)=='7'){
                angkatan = "2017";
            }else if(getNIM().charAt(1)=='8'){
                angkatan = "2018";
            }else if(getNIM().charAt(1)=='9'){
                angkatan = "2019";
            }
        }
        if(getNIM().charAt(0)=='2'){
            if(getNIM().charAt(1)=='0'){
                angkatan = "2020";
            }else if(getNIM().charAt(1)=='1'){
                angkatan = "2021";
            }else if(getNIM().charAt(1)=='2'){
                angkatan = "2022";
            }
        }
        if(getNIM().charAt(6)=='2'){
            prodi = "Teknik Informatika";
        }else if(getNIM().charAt(6)=='3'){
            prodi = "Teknik Komputer";
        }else if(getNIM().charAt(6)=='4'){
            prodi = "Sistem Informasi";
        }else if(getNIM().charAt(6)=='6'){
            prodi = "Penddikan Teknologi Informasi";
        }else if(getNIM().charAt(6)=='7'){
            prodi = "Teknologi Informasi";
        }
        return prodi + ", " +angkatan;
    }

    public double getBeasiswa(){
    double b = 0.0;
    if(IPK >= 3.0 && IPK <= 3.5){
        b = 50;
    }else if(IPK >= 3.5 && IPK <= 4){
        b = 75;
    }
    return b;
    }

    public double getPendapatanAkhir(){
        double pendapatanAkhir =
        getBeasiswa()+super.getPendapatanManusia();
        return pendapatanAkhir;
    }

    public String toString(){
        return "Nama\t\t\t : " +getNama()+ "\nNIK\t\t\t : " +getNik()+ "\nJenis Kelamin\t\t : " +getJenisKelamin()+ "\nTotal Pendapatan\t : $" +getPendapatanAkhir()+ "\nNIM\t\t\t : " +getNIM()+"\nIPK\t\t\t : " +getIPK()+ "\nStatus\t\t\t :"+getStatus();
    }

}
