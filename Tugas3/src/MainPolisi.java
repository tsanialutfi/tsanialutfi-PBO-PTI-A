public class MainPolisi {
    public static void main(String[] args) {
        Polisi polisi = new Polisi("Nizar", true, "Kepala Polisi", 45, "Kantor Polisi Daerah");
        polisi.main();
        polisi.patroliMalam(23);
        polisi.operasiLaluLintas("Jalan Veteran");
        polisi.pelayananMasyarakat();
    
    }
}
