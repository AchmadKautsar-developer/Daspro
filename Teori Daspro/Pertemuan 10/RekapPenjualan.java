import java.util.Scanner;

public class RekapPenjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah produk dan jumlah hari (minimal 1)
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = scanner.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();

        int totalSeluruhProduk = 0;
        int i = 1;

        // Outer loop menggunakan while untuk produk
        while (i <= jumlahProduk) {
            System.out.println("\n--- Produk ke-" + i + " ---");
            int totalProduk = 0;

            // Inner loop menggunakan for untuk hari
            for (int j = 1; j <= jumlahHari; j++) {
                int terjual;
                
                // Do-while untuk memastikan input tidak negatif
                do {
                    System.out.print("Masukkan jumlah terjual hari ke-" + j + ": ");
                    terjual = scanner.nextInt();
                    if (terjual < 0) {
                        System.out.println("Error: Jumlah terjual tidak boleh negatif! Silakan masukkan ulang.");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            // Hitung rata-rata harian tiap produk
            double rataRata = (double) totalProduk / jumlahHari;

            // Tampilkan total dan rata-rata harian tiap produk
            System.out.println("Total penjualan produk ke-" + i + " = " + totalProduk);
            System.out.println("Rata-rata harian produk ke-" + i + " = " + rataRata);

            totalSeluruhProduk += totalProduk;
            i++;
        }

        // Tampilkan total seluruh produk
        System.out.println("\n========================================");
        System.out.println("Total keseluruhan dari semua produk = " + totalSeluruhProduk);
        System.out.println("========================================");

        scanner.close();
    }
}