import java.time.LocalDate;
public class MainClass {
    public static void main(String[] args) {
    System.out.println("MANUSIA : ");  
      Manusia M1 = new Manusia(" Febry",true,"352121",true);
      System.out.println(M1);
      
      System.out.println("___________________________________________________");

      Manusia M2 = new Manusia(" Rani",false,"352122",true);
      System.out.println(M2);

      System.out.println("____________________________________________________");

      Manusia M3 = new Manusia(" Alfin",true,"352123",false);
      System.out.println(M3);

      System.out.println("====================================================");

      System.out.println("MAHASISWA : ");
      MahasiswaFILKOM F1 = new MahasiswaFILKOM("215150201111001", 2.7, " Nana", false, "352111",true);
      System.out.println(F1);

      System.out.println("______________________________________________________");

      MahasiswaFILKOM F2 = new MahasiswaFILKOM("225150607111010", 3.3, " Naura", false, "3521112",true);
      System.out.println(F2);

      System.out.println("_______________________________________________________");

      MahasiswaFILKOM F3 = new MahasiswaFILKOM("205150300111017", 3.9, " Bintang", true, "3521113",true);
      System.out.println(F3);

      System.out.println("=======================================================");

      System.out.println("PEKERJA : ");
      Pekerja P1 = new Pekerja(1000, LocalDate.of(2022,1,20),2," Zido", "352110",true,false);
      System.out.println(P1);
      System.out.println("Bonus yang di dapat     : $"+P1.getBonus());
      System.out.println("Tunjangan yang di dapat   : $"+ P1.getTunjangan());
      System.out.println("Tunjangan dari jumlah anak yang di dapat  : $"+ P1.getTunjanganAnak());
      System.out.println("Total Pendapatan    : $" + P1.getPendapatanAkhir());

      System.out.println("_______________________________________________________");

      Pekerja P2 = new Pekerja(1000, LocalDate.of(2015,3,20), 0, " Nazla", "3521100",false,true);
      System.out.println(P2);
      System.out.println("Bonus yang di dapat     : $"+P2.getBonus());
      System.out.println("Tunjangan yang di dapat   : $"+ P2.getTunjangan());
      System.out.println("Tunjangan dari jumlah anak yang di dapat  : $"+ P2.getTunjanganAnak());
      System.out.println("Total Pendapatan    : $" + P2.getPendapatanAkhir());

      System.out.println("_______________________________________________________");

      Pekerja P3 = new Pekerja(1000, LocalDate.of(2004,3,20),10," Feri","35211000",true,false);
      System.out.println(P3);
      System.out.println("Bonus yang di dapat     : $" + P3.getBonus());
      System.out.println("Tunjangan yang di dapat   : $"+ P3.getTunjangan());
      System.out.println("Tunjangan dari jumlah anak yang di dapat  : $" + P3.getTunjanganAnak());
      System.out.println("Total Pendapatan    : $" + P3.getPendapatanAkhir());

      System.out.println("========================================================");
      
      System.out.println("MANAGER : ");
      ManagerManager G1 = new ManagerManager("Manager Pemasaran",7500,LocalDate.of(2009,2,14),0," Bian",true,"3521003",false);
      System.out.println(G1);
      System.out.println("Bonus yang di dapat     : $" + G1.getBonus());
      System.out.println("Tunjangan yang di dapat  : $" + G1.getTunjangan());
      System.out.println("Tunjangan dari jumlah anak yang di dapat  : $" + G1.getTunjanganAnak());
      System.out.println("Total Pendapatan    : $" + G1.getPendapatanAkhir());
    }
}
