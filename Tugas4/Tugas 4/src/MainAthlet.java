public class MainAthlet {
    public static void main(String[] args) {
        Athlet athlet = new Athlet("Alfin Daniel", 23, "Bola Voli", 65, true);
        athlet.main();
        athlet.latihan("drill dan training");
        athlet.pertandingan();
        athlet.menang(1);

        System.out.println("============================================================");
        Athlet athlet2 = new Athlet();
        athlet2.main();
        athlet2.latihan("drill");
        athlet2.pertandingan();
        athlet2.menang(2);

        System.out.println("============================================================");
        Athlet athlet3 = new Athlet("Bulu Tangkis",false);
        athlet3.main();
        athlet3.latihan("gym");
        athlet.pertandingan();
        athlet3.menang(1);
    }
}
