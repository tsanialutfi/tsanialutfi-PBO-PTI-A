import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //  Employee employee = new Employee("Nana","123");//jawaban nomor 1

        SalariedEmployee salariedemployee = new SalariedEmployee("Daniel", "135", 800.00);
        HourlyEmployee hourlyemployee = new HourlyEmployee("Karina","234",16.75,40);
        CommissionEmployee commissionemployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);

        System.out.println("Employees diproses secara terpisah :\n");
        System.out.printf("%s\n%s: $%,.2f\n\n",salariedemployee,"pendapatan : ",salariedemployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",hourlyemployee,"Pendapatan : ",hourlyemployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",commissionemployee,"pendapatan : ",commissionemployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedemployee;
        employees[1] = hourlyemployee;
        employees[2] = commissionemployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees diproses secara polimorfisme : \n");
        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% :$%,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("pendapatan : $%,.2f\n\n",currentEmployee.earnings());
        }
        for(int j = 0; j<employees.length; j++){
            System.out.printf("Employe%d = %s\n",j,employees[j].getClass().getName());
        }

        //Uji nomor 4
        LocalDate tanggalLahir = LocalDate.of(1990, 6, 12);

        Employee[] employee = {
            new SalariedEmployee("Fani", "3521", tanggalLahir, 5000000),
            new HourlyEmployee("Viko", "3522", tanggalLahir, 500000,16),
            new CommissionEmployee("Dion", "3524", tanggalLahir, 1000000,0.1),
            new BasePlusCommissionEmployee("Linda", "3525", tanggalLahir, 1000000,0.1)
        };

        for (Employee employe : employees) {
            double salary = employe.calculateSalary();
            if (Employee.isBulanUlangTahun(employe.getTanggalLahir())) {
                salary += 100000;
                System.out.println("Selamat ulang tahun");
            } else {
                System.out.println("Anda tidak sedang berulang tahun");
            }
            System.out.println(employe.getName() + " menerima gaji sebesar Rp. " + salary);
        }

        //nomor 5
        // Membuat objek karyawan
        Karyawan karyawan1 = new Karyawan("Rendi", 10000, 50);
        Karyawan karyawan2 = new Karyawan("Yanua", 12000, 60);
        Karyawan karyawan3 = new Karyawan("Farhan", 15000, 70);
        Karyawan karyawan4 = new Karyawan("Rifat", 18000, 80);

        // Menampilkan gaji karyawan
        System.out.println();
        System.out.println("Gaji Karyawan:");
        System.out.println(karyawan1.getNama() + ": " + karyawan1.hitungGaji());
        System.out.println(karyawan2.getNama() + ": " + karyawan2.hitungGaji());
        System.out.println(karyawan3.getNama() + ": " + karyawan3.hitungGaji());
        System.out.println(karyawan4.getNama() + ": " + karyawan4.hitungGaji());
    }
    
}
