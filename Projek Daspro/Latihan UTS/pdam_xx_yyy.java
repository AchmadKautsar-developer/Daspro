import java.util.Scanner;

public class pdam_xx_yyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan ID Pelanggan: ");
        String idPelanggan = sc.nextLine();

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Masukkan Kode Golongan (1=Sosial, 2=Rumah Tangga, 3=Bisnis/UMKM, 4=Industri/Pabrik): ");
        int kodeGolongan = sc.nextInt();

        System.out.print("Masukkan Kubikasi Pemakaian Air (m3): ");
        double kubikasi = sc.nextDouble();

        System.out.print("Masukkan Tanggal Pembayaran (1-31): ");
        int tanggal = sc.nextInt();

        // Validasi input awal
        if (kodeGolongan < 1 || kodeGolongan > 4) {
            System.out.println("Kode golongan tidak valid!");
        } else if (kubikasi < 0) {
            System.out.println("Kubikasi pemakaian air tidak boleh negatif!");
        } else if (tanggal < 1 || tanggal > 31) {
            System.out.println("Tanggal pembayaran tidak valid (harus 1-31)!");
        } else {
            double tarifDasar = 0;
            double tarifProgresif1 = 0;
            double tarifProgresif2 = 0;
            double biayaAdmin = 0;

            // Penentuan tarif berdasarkan kode golongan menggunakan switch-case
            switch (kodeGolongan) {
                case 1: // Sosial
                    tarifDasar = 1500;
                    tarifProgresif1 = 2000;
                    tarifProgresif2 = 3000;
                    biayaAdmin = 2500;
                    break;
                case 2: // Rumah Tangga
                    tarifDasar = 3000;
                    tarifProgresif1 = 4500;
                    tarifProgresif2 = 6000;
                    biayaAdmin = 5000;
                    break;
                case 3: // Bisnis/UMKM
                    tarifDasar = 6000;
                    tarifProgresif1 = 8000;
                    tarifProgresif2 = 10000;
                    biayaAdmin = 10000;
                    break;
                case 4: // Industri/Pabrik
                    tarifDasar = 10000;
                    tarifProgresif1 = 13000;
                    tarifProgresif2 = 16000;
                    biayaAdmin = 20000;
                    break;
            }

            // Hitung Biaya Pemakaian Air Berjenjang (Progresif)
            double biayaPemakaian = 0;
            if (kubikasi <= 10) {
                biayaPemakaian = kubikasi * tarifDasar;
            } else if (kubikasi <= 30) {
                biayaPemakaian = (10 * tarifDasar) + ((kubikasi - 10) * tarifProgresif1);
            } else {
                biayaPemakaian = (10 * tarifDasar) + (20 * tarifProgresif1) + ((kubikasi - 30) * tarifProgresif2);
            }

            // Total sebelum denda
            double totalSebelumDenda = biayaPemakaian + biayaAdmin;

            // Hitung Denda Keterlambatan
            double denda = 0;
            if (tanggal >= 1 && tanggal <= 20) {
                denda = 0;
            } else if (tanggal >= 21 && tanggal <= 25) {
                denda = 0.01 * totalSebelumDenda; // 1%
            } else if (tanggal > 25 && tanggal <= 31) {
                denda = 0.015 * totalSebelumDenda; // 1.5%
            }

            // Total Tagihan Akhir
            double totalTagihan = totalSebelumDenda + denda;

            // Output Hasil Rincian
            System.out.println("\n--- RINCIAN TAGIHAN AIR PDAM ---");
            System.out.println("ID Pelanggan      : " + idPelanggan);
            System.out.println("Nama Pelanggan    : " + namaPelanggan);
            System.out.println("Biaya Pemakaian Air: Rp" + (long)biayaPemakaian);
            System.out.println("Biaya Administrasi : Rp" + (long)biayaAdmin);
            System.out.println("Total Sebelum Denda: Rp" + (long)totalSebelumDenda);
            System.out.println("Denda Keterlambatan: Rp" + (long)denda);
            System.out.println("Total Tagihan      : Rp" + (long)totalTagihan);
        }

        sc.close();
    }
}