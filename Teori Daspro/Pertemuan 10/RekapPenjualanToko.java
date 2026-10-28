import java.util.Scanner;

public class RekapPenjualanToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahProduk = 0;
        int jumlahHari = 0;
        
        do {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jumlahProduk = scanner.nextInt();
            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk harus minimal 1!");
            }
        } while (jumlahProduk < 1);
        
        do {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jumlahHari = scanner.nextInt();
            if (jumlahHari < 1) {
                System.out.println("Jumlah hari harus minimal 1!");
            }
        } while (jumlahHari < 1);
        
        double grandTotal = 0;
        int i = 1;
        
        while (i <= jumlahProduk) {
            System.out.println("\n--- Rekap Produk ke-" + i + " ---");
            double totalProduk = 0;
            
            for (int j = 1; j <= jumlahHari; j++) {
                int terjual;
                
                do {
                    System.out.print("Masukkan jumlah terjual hari ke-" + j + ": ");
                    terjual = scanner.nextInt();
                    if (terjual < 0) {
                        System.out.println("Peringatan: Jumlah terjual tidak boleh negatif! Silakan ulangi.");
                    }
                } while (terjual < 0);
                
                totalProduk += terjual;
            }
            
            double rataRata = totalProduk / jumlahHari;
            
            System.out.println("Total penjualan Produk ke-" + i + " = " + totalProduk);
            System.out.println("Rata-rata harian Produk ke-" + i + " = " + rataRata);
            
            grandTotal += totalProduk;
            i++;
        }
        
        System.out.println("\n========================================");
        System.out.println("TOTAL KESELURUHAN SELURUH PRODUK = " + grandTotal);
        System.out.println("========================================");
        
        scanner.close();
    }
}