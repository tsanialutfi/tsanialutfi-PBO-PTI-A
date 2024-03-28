import java.util.Scanner;
public class MainPelanggan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        Customer account = new Customer("Alfin Daniel Pratama", "5634567890",56);
        account.getName();
        account.getCustomerNumber();
        account.setBalance(10_000);
        account.getCashbackRate();

        System.out.println("Nama : " + account.getName());
        System.out.println("Nomor Pelanggan : "+ account.getCustomerNumber());
        System.out.println("Saldo : "+account.getBalance());
        System.out.print("Masukkan PIN: ");
        int pin = input.nextInt();
        int counter = 1;
        while (pin != 7721 && counter < 3) {
        System.out.println("PIN salah. Masukkan lagi.");
        pin = input.nextInt();
        counter++;
        }
    
        if (pin == 7721) {
            System.out.println("Pelanggan jenis rekening: " + account.getJenisRekeningString());
            System.out.println("Saldo Anda: " + account.getBalance());
            System.out.print("Masukkan harga pembelian: ");
            int hargaPembelian = input.nextInt();
    
            // Memeriksa apakah saldo cukup
            if (hargaPembelian > account.getBalance()) {
            System.out.println("Saldo tidak cukup.");
            System.out.print("Masukkan jumlah yang ingin ditop up: ");
            int topUpAmount = input.nextInt();
            account.tambahSaldo(topUpAmount);
            System.out.println("Saldo Anda sekarang: " + account.getBalance());
    
            // Memasukkan Harga ulang
            System.out.print("Masukkan harga pembelian : ");
            hargaPembelian = input.nextInt();
        }
            //implementasi cashback
            account.kurangSaldo(hargaPembelian);
            int cashback = account.cashbackAkun();
            System.out.println("Cashback yang didapat: " + cashback);
            System.out.println("Saldo Anda sekarang: " + account.getBalance());
        } else {
            System.out.println("PIN salah lebih dari 3 kali. Akun terblokir.");
        }
        
            
    }
}
