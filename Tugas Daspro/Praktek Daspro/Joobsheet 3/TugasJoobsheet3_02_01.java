import java.util.Scanner;

public class TugasJoobsheet3_02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konstanta biaya
        final int BIAYA_PER_LEMBAR = 500;
        final int BIAYA_JILID = 5000;

        // 1. Input jumlah lembar dokumen (x)
        System.out.print("Masukkan jumlah lembar dokumen (x) : ");
        int jumlahLembar = scanner.nextInt();

        // 2. Hitung biaya cetak dan total biaya
        int biayaCetak = jumlahLembar * BIAYA_PER_LEMBAR;
        int totalBiaya = biayaCetak + BIAYA_JILID;

        // 3. Tampilkan hasil perhitungan
        System.out.println("----------------------------------------");
        System.out.printf("Biaya Cetak (%d lembar) : Rp %,d%n", jumlahLembar, biayaCetak);
        System.out.printf("Biaya Penjilidan       : Rp %,d%n", BIAYA_JILID);
        System.out.printf("Total Biaya            : Rp %,d%n", totalBiaya);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
