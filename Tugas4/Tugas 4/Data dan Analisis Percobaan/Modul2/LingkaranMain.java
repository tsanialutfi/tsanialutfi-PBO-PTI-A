public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();

        Lingkaran l2 = new Lingkaran(4,10);
        l2.displayMessage();

        //jawaban nomor 3
        Lingkaran Lstring = new Lingkaran("10", "20");
        Lstring.displayMessage();
    }
}
