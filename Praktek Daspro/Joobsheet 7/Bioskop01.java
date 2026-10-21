import java.util.Scanner;

public class Bioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatanHariIni = 0;

        System.out.println("=== Program Penghitung Penjualan Tiket Bioskop ===");
        System.out.println("Ketik '0' atau jumlah tiket negatif untuk mengakhiri transaksi hari ini.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (atau 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (tidak boleh negatif). Silakan masukkan ulang.\n");
                continue;
            }

            double totalHarga = jumlahTiket * hargaPerTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            double totalBayar = totalHarga - (totalHarga * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPendapatanHariIni += totalBayar;

            System.out.println("Diskon yang didapat: " + (int)(diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + (int)totalBayar);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n=== REKAP PENJUALAN KESELURUHAN HARI INI ===");
        System.out.println("Total keseluruhan tiket terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan penjualan     : Rp " + (int)totalPendapatanHariIni);
        
        sc.close();
    }
}