public class Mainnn {
    public static void main(String[] args) {
    
        Pegawai pegawai1 = new PegawaiTetap("Rendi", "35212110", 8000000);
        Pegawai pegawai2 = new PegawaiHarian("Reza", "35212111", 13000, 45);
        Pegawai pegawai3 = new Sales("Naura ", "35212112", 1000000, 0.1);

        // Upcasting
        Pegawai pegawaiArray[] = {pegawai1, pegawai2, pegawai3};

        // Downcasting
        PegawaiTetap pegawaiTetap = (PegawaiTetap) pegawaiArray[0];
        PegawaiHarian pegawaiHarian = (PegawaiHarian) pegawaiArray[1];
        Sales sales = (Sales) pegawaiArray[2];

        // Display
        System.out.println("Nama Pegawai Tetap : " + pegawaiTetap.getNama());
        System.out.println("No. KTP            : " + pegawaiTetap.getNoKTP());
        System.out.println("Gaji               : " + pegawaiTetap.hitungGaji());
        System.out.println();

        System.out.println("Nama Pegawai Harian : " + pegawaiHarian.getNama());
        System.out.println("No. KTP             : " + pegawaiHarian.getNoKTP());
        System.out.println("Upah per Jam        : " + pegawaiHarian.getUpahPerJam());
        System.out.println("Total Jam Kerja     : " + pegawaiHarian.getTotalJamKerja());
        System.out.println("Gaji                : " + pegawaiHarian.hitungGaji());
        System.out.println();

        System.out.println("Nama Sales      : " + sales.getNama());
        System.out.println("No. KTP         : " + sales.getNoKTP());
        System.out.println("Total Penjualan : " + sales.getTotalPenjualan());
        System.out.println("Komisi          : " + sales.getKomisi());
        System.out.println("Gaji            : " + sales.hitungGaji());
    }
}
