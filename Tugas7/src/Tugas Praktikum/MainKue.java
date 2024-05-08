public class MainKue {
    public static void main(String[] args) {
        Kue[] kue = new Kue[20];
    
        kue[0] = new KuePesanan("Gateau African Taartjes", 17400, 8);       
        kue[1] = new KuePesanan("Lemon Taartjes", 14900, 5);      
        kue[2] = new KuePesanan("Lemon Classic Cheese Cake",18200, 6); 
        kue[3] = new KuePesanan("Strawberry Hias", 16800, 4);       
        kue[4] = new KuePesanan("Mango Cake", 18000, 4);       
        kue[5] = new KuePesanan("Soft Cheese Cake", 17500, 10);       
        kue[6] = new KuePesanan("Banana Roll", 14000, 6);       
        kue[7] = new KuePesanan("Black Forest Taartjes", 20400,8);       
        kue[8] = new KuePesanan("Chocolate Classic Cheese Cake", 18800, 7);       
        kue[9] = new KuePesanan("Tiramisu", 19800, 9);             
        kue[10] = new KueJadi("Triple Decker", 16800, 6);       
        kue[11] = new KueJadi("Passion Fruit", 17500, 8);       
        kue[12] = new KueJadi("Layer of Happiness", 19800, 8);       
        kue[13] = new KueJadi("Double Chocolate", 20300, 6);       
        kue[14] = new KueJadi("Rainbow Cake", 13600, 4);       
        kue[15] = new KueJadi("Lapis Legit", 22000, 4);       
        kue[16] = new KueJadi("Choco Mousse", 17300, 6);       
        kue[17] = new KueJadi("Chocolate De Ville", 19600, 5);       
        kue[18] = new KueJadi("Lava Cake", 16000, 6);       
        kue[19] = new KueJadi("Mango Cassata", 16300, 8);

        System.out.println("=============================================");       
        System.out.println("================ Kue Pesanan ================");       
        System.out.println("=============================================");       
        System.out.println();       
        for (int i = 0; i < 20; i++) {           
            if (i == 10) {               
                System.out.println("============================================");               
                System.out.println("================= Kue Jadi =================");               
                System.out.println("============================================");               
                System.out.println();           }           
                System.out.println(kue[i].toString());           
                System.out.println();       
            }
        }
        
    
    double totalHarga = 0;{
        Kue[] kue = new Kue[20];
        for(int i = 0; i < kue.length; i++){
            totalHarga += kue[i].hitungHarga();
        } 

        double hargaKp = 0;       
        double beratKp = 0;       
        for (int i = 0; i < 10; i++) {           
            hargaKp += kue[i].hitungHarga();           
            if (kue[i] instanceof KuePesanan) {               
                KuePesanan pesanan = (KuePesanan) kue[i];              
                beratKp += pesanan.getBerat();
            }
        }
        
        double hargaKj = 0;       
        double jumlahKj = 0;       
        for (int i = 10; i < 20; i++) {           
            hargaKj += kue[i].hitungHarga();           
            if (kue[i] instanceof KueJadi) {               
                KueJadi jadi = (KueJadi) kue[i];               
                jumlahKj += jadi.getJumlah();           
            }       
        }

        double harga[] = new double[20];       
        for (int i = 0; i < 20; i++) {           
            harga[i] = kue[i].hitungHarga();       
        } 

        String termahal = "";       
        double tertinggi = getTertinggi(harga);       
        for (int j = 0; j < 20; j++) {           
            if (kue[j].hitungHarga() == tertinggi) {               
                termahal = kue[j].getNama();           
            }       
        }


        System.out.println("============================================");       
        System.out.println("Total Harga Kue\t\t\t: Rp. " + totalHarga);       
        System.out.println("Total Harga Kue Pesanan\t: Rp. " + hargaKp);       
        System.out.println("Total Berat Kue Pesanan\t: " + beratKp);       
        System.out.println("Total Harga Kue Jadi\t: Rp. " + hargaKj);       
        System.out.println("Total Jumlah Kue Jadi\t: " + jumlahKj);       
        System.out.println("Kue Termahal\t\t\t: " + termahal);       
        System.out.println("============================================");   
    }   

    public static double  getTertinggi(double[] inputArray) {       
        double nilaiTertinggi = inputArray[0];       
        for (int i = 1; i < inputArray.length; i++) {           
            if (inputArray[i] > nilaiTertinggi) {               
                nilaiTertinggi = inputArray[i];           
            }       
        }       
        return nilaiTertinggi;

    } 

}
        // Kue[] kueTermahal = null;
        // double hargaTermahal = 0;
        // for (Kue kuekue : kue) {
        //     if (kue.length > hargaTermahal) {
        //         hargaTermahal = kue.length;
        //         kueTermahal = kue;
        //     }
        // }
        // System.out.println("Kue dengan Harga Termahal: " + kueTermahal);

        // System.out.println("Semua Kue: ");
        // for (Kue k : kue) {
        //     if (k!= null) {
        //         System.out.println("Nama Kue: " + k.getNama() + ", Harga: " + k.getHarga());
        //     }
        // }
        // for (Kue kuekue : kue) {
        //     if (kue instanceof KuePesanan) {
        //         System.out.println("Kue Pesanan: " + kue.getNama() + ", Harga: " + kue.getHarga() + ", Berat: " + ((KuePesanan) kue).getBerat());
        //     } else if (kue instanceof KueJadi) {
        //         System.out.println("Kue Jadi: " + kue.getNama() + ", Harga: " + kue.getHarga() + ", Jumlah: " + ((KueJadi) kue).getJumlah());
        //     }
        // }

        // double totalHarga = 0;
        // for (Kue kuekue : kue) {
        //     totalHarga += kue.getHarga();
        // }
        // System.out.println("Total Harga: " + totalHarga);

        // double totalHargaPesanan = 0;
        // double totalBeratPesanan = 0;
        // for (Kue kuekue : kue) {
        //     if (kue instanceof KuePesanan) {
        //         totalHargaPesanan += kue.getHarga();
        //         totalBeratPesanan += ((KuePesanan) kue).getBerat();
        //     }
        // }
        // System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        // System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);

        // double totalHargaJadi = 0;
        // int totalJumlahJadi = 0;
        // for (Kue kuekue : kue) {
        //     if (kue instanceof KueJadi) {
        //         totalHargaJadi += kue.getHarga();
        //         totalJumlahJadi += ((KueJadi) kue).getJumlah();
        //     }
        // }
        // System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        // System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);

        //
        

