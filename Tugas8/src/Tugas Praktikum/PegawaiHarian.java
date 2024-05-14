public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJamKerja;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJamKerja) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
   }

    public int getTotalJamKerja() {
        return totalJamKerja;
    }

    @Override
    public double hitungGaji() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            return (40 * upahPerJam) + (totalJamKerja - 40) * upahPerJam * 1.5;
        }
    }
}
