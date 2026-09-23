import java.util.Scanner;

public class TugasParkir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Parkir ===");
        System.out.print("Masukkan jenis kendaraan (1: Motor, 2: Mobil): ");
        int jenis = sc.nextInt();

        System.out.print("Masukkan durasi parkir (jam): ");
        int jam = sc.nextInt();

        int total = 0;

        if (jenis == 1) { // Motor
            total = jam * 2000;
            System.out.println("Jenis Kendaraan : Motor");
            System.out.println("Total Bayar     : Rp " + total);
        } else if (jenis == 2) { // Mobil
            total = jam * 5000;
            System.out.println("Jenis Kendaraan : Mobil");
            System.out.println("Total Bayar     : Rp " + total);
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }

        sc.close();
    }
}