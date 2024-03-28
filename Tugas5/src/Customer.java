public class Customer {
        private String name;
        private String customerNumber;
        private double balance;
        private double cashbackRate;
        private final int jenisRekening;
    
        public double getCashbackRate() {
            return cashbackRate;
        }

        public Customer(String name, String customerNumber, int jenisRekening) {
            this.jenisRekening = jenisRekening;
            this.name = name;
            this.customerNumber = customerNumber;
            this.balance = 10000.0;
            setCashbackRate();
        }
    
        // Accessor methods for Getter and Setter
        public int getJenisRekening() {
            return jenisRekening;
        }
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getCustomerNumber() {
            return customerNumber;
        }
    
        public void setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
        }
    
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 10000.0) {
                this.balance = balance;
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        }

        public double setCashbackRate() {
            return cashbackRate;
        }

        public String getJenisRekeningString() {
            switch (jenisRekening) {
                case 38:
                    return "Silver";
                case 56:
                    return "Gold";
                case 74:
                    return "Platinum";
                default:
                    return "Tidak diketahui";
            }
        }
        
        public void tambahSaldo(int jumlah){
            balance += jumlah;
        }
        public void kurangSaldo(int jumlah){
            balance -= jumlah;
        }

    public int cashbackAkun() {
            if (this.getJenisRekening() == 38) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.05);
                }
            } else if (this.getJenisRekening() == 56) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.07);
                } else {
                    return (int) (this.getBalance() * 0.02);
                }
            } else if (this.getJenisRekening() == 74) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.10);
                } else {
                    return (int) (this.getBalance() * 0.05);
                }
            }
        return 0;
    }
}