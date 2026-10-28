import java.util.Scanner;

public class Tugas3_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1;
            int tokoTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();
                while (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                    jumlahPelanggan = sc.nextInt();
                }

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int barangPelanggan = sc.nextInt();

                    while (barangPelanggan < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                        System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                        barangPelanggan = sc.nextInt();
                    }

                    totalBarangToko += barangPelanggan;
                }

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruhToko += totalBarangToko;

                if (totalBarangToko > maxBarangToko) {
                    maxBarangToko = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }

            System.out.println("========================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }

        sc.close();
    }
}