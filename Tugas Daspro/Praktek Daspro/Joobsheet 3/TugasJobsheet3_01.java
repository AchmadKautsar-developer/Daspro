import java.util.Scanner;

public class TugasJobsheet3_01 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // 1. Input data dari pengguna
        System.out.print("Masukkan harga laptop (x) : Rp ");
        double hargaLaptop = scanner.nextDouble();

        System.out.print("Masukkan uang muka (y)    : Rp ");
        double uangMuka = scanner.nextDouble();

        System.out.print("Masukkan lama cicilan (z) : ");
        int lamaCicilan = scanner.nextInt(); // dalam bulan

        // 2. Hitung sisa harga
        double sisaHarga = hargaLaptop - uangMuka;

        // 3. Hitung bunga tetap per bulan (2% dari sisa harga)
        double bungaPerBulan = 0.02 * sisaHarga;

        // 4. Hitung cicilan pokok per bulan
        double cicilanPokok = sisaHarga / lamaCicilan;

        // 5. Total cicilan yang dibayar Rina per bulan
        double totalCicilan = cicilanPokok + bungaPerBulan;

        // Tampilkan hasil perhitungan
        System.out.println("----------------------------------------");
        System.out.printf("Sisa harga yang dicicil : Rp %,.2f%n", sisaHarga);
        System.out.printf("Bunga per bulan (2%%)   : Rp %,.2f%n", bungaPerBulan);
        System.out.printf("Total cicilan per bulan : Rp %,.2f%n", totalCicilan);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}