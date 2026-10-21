import java.util.Scanner;

public class ParkirNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0; // Menampung total bayar keseluruhan
        int bayar = 0; // Menampung bayar per transaksi

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    bayar = 12500; // Jika durasi > 5 jam (tarif flat)
                } else if (jenis == 1) {
                    bayar = durasi * 3000; // Mobil
                } else if (jenis == 2) {
                    bayar = durasi * 2000; // Motor
                }

                total += bayar;
                System.out.println("Total bayar transaksi ini: Rp " + bayar);
                System.out.println("----------------------------------------");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
        sc.close();
    }
}