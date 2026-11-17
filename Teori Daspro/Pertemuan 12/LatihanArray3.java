import java.util.Scanner;

public class LatihanArray3 {
    public static void main(String[] args) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka bulan (1-12): ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 12) {
            System.out.println("Nama bulan: " + namaBulan[n - 1]);
        } else {
            System.out.println("Input tidak valid! Masukkan angka 1 sampai 12.");
        }
    }
}