public class Sales extends Pegawai {
    private int totalPenjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int totalPenjualan, double komisi) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    public double getTotalPenjualan() {
        return totalPenjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    @Override
    public double hitungGaji() {
        return totalPenjualan * komisi;
    }
}
