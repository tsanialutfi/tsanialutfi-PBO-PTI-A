import java.util.Scanner;

public class nilaiSiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int numSiswa = scanner.nextInt();
        String[] namaSiswa = new String[numSiswa];
        int[] nilaiSiswa  = new int[numSiswa];

        for (int i = 0; i < numSiswa; i++) {
            System.out.print("Masukkan nama siswa" + (i + 1) + ": ");
            scanner.nextLine(); 
            namaSiswa[i] = scanner.nextLine();

            System.out.print("Masukkan nilai siswa " + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextInt();
        }

        System.out.println("\nList siswa dan nilainya:");
        printListGradeSiawa(namaSiswa, nilaiSiswa);
    }

    // Method untuk menampilkan grade nilai 
    private static void printListGradeSiawa(String[] namaStudent, int[] nilaiStudent) {
        String grade;

        for (int i = 0; i < namaStudent.length; i++) {
            if (nilaiStudent[i] >= 90) {
                grade = "A";
            } else if (nilaiStudent[i] >= 80) {
                grade = "B";
            } else if (nilaiStudent[i] >= 70) {
                grade = "C";
            } else if (nilaiStudent[i] >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println((i + 1) + ". " + namaStudent[i] + " - Grade: " + grade);
        }
    }
}