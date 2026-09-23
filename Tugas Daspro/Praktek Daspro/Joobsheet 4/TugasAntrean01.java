import java.util.Scanner;

public class TugasAntrean01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mesin Antrean Akademik ===");
        System.out.println("1. Layanan Kartu Rencana Studi (KRS)");
        System.out.println("2. Layanan Transkrip Nilai");
        System.out.println("3. Layanan Surat Keterangan Mahasiswa Aktif");
        System.out.println("4. Layanan Pengajuan Cuti Akademik");
        System.out.print("Pilih kode layanan (1-4): ");
        int kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Anda memilih: Layanan Kartu Rencana Studi (KRS)");
                System.out.println("Nomor Antrean Anda: A-01");
                break;
            case 2:
                System.out.println("Anda memilih: Layanan Transkrip Nilai");
                System.out.println("Nomor Antrean Anda: B-01");
                break;
            case 3:
                System.out.println("Anda memilih: Layanan Surat Keterangan Mahasiswa Aktif");
                System.out.println("Nomor Antrean Anda: C-01");
                break;
            case 4:
                System.out.println("Anda memilih: Layanan Pengajuan Cuti Akademik");
                System.out.println("Nomor Antrean Anda: D-01");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }

        sc.close();
    }
}
