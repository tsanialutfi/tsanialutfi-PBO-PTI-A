public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        super(registrationNumber, name, salaryPerMonth, invoices);
    }

    @Override
    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : getInvoices()) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return gajiPerBulan - totalInvoiceAmount;
    }
}
