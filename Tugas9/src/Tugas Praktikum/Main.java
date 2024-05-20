public class Main {
    public static void main(String[] args) {
        // Create invoices
        Invoice invoice1 = new Invoice("Face Wash", 2, 17000);
        Invoice invoice2 = new Invoice("Buku", 3, 4000);
        Invoice invoice3 = new Invoice("Yakult", 6, 2000);
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        // Create employee
        Employee employee = new FullTimeEmployee(001, "Febry", 5_000_000, invoices);

        // Print employee information
        System.out.println("Informasi Karyawan :");
        System.out.println("Nomor Registrasi : " + employee.getRegistrationNumber());
        System.out.println("Nama : " + employee.getName());
        System.out.println("Gaji/bulan: " + employee.getSalaryPerMonth());

        // Print invoices
        System.out.println("Invoices:");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Nama produk: " + invoice.getProductName() + ", Jumlah: " + invoice.getQuantity() + ", Harga/@: " + invoice.getPricePerItem());
        }

        // Print total payable amount
        System.out.println("Total gaji setelah dipotong : " + employee.getPayableAmount());
    }
}
