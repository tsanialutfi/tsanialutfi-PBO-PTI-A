// Abstract class Employee
public abstract class Employee implements Payable {
    protected int nomorRegistrasi;
    protected String nama;
    protected int gajiPerBulan;
    protected Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.nomorRegistrasi = registrationNumber;
        this.nama = name;
        this.gajiPerBulan = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return nomorRegistrasi;
    }

    public String getName() {
        return nama;
    }

    public int getSalaryPerMonth() {
        return gajiPerBulan;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.gajiPerBulan = salaryPerMonth;
    }

    @Override
    public abstract int getPayableAmount();

    // Instance method: calculateInvoiceTotal
    public int calculateInvoiceTotal() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : getInvoices()) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return totalInvoiceAmount;
    }

    // Instance method: printEmployeeDetails
    public void printEmployeeDetails() {
        System.out.println("Informasi Karyawan :");
        System.out.println("Nomor Registrasi : " + getRegistrationNumber());
        System.out.println("Nama: " + getName());
        System.out.println("Gaji/bulan: " + getSalaryPerMonth());
        System.out.println("Invoices:");
        for (Invoice invoice : getInvoices()) {
            System.out.println("Nama Produk: " + invoice.getProductName() + ", Jumlah: " + invoice.getQuantity() + ", Harga/@: " + invoice.getPricePerItem());
        }
    }

    // Static method: getEmployeeCount
    public static int getEmployeeCount(Employee[] employees) {
        return employees.length;
    }
}