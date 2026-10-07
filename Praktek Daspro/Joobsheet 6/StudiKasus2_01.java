import java.util.Scanner;

public class StudiKasus2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data Umum
        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = scanner.nextLine().trim().toUpperCase();

        // Variabel penampung
        int jumlahDokumen = 0;
        int peringkatJuara = 0;
        int statusPendanaan = 0;

        // Nested IF Tingkat 1: Cek Jenis Kegiatan
        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
            // Input tambahan khusus lomba
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = scanner.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = scanner.nextInt();

            // Nested IF Tingkat 2: Cek Kelengkapan Dokumen
            if (jumlahDokumen == 4) {
                // Nested IF Tingkat 3: Cek Prestasi Juara
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap. Selamat, Anda berhak menerima dana penghargaan!");
                } else {
                    System.out.println("Status : Dokumen lengkap, namun hanya peraih Juara 1, 2, atau 3 yang memperoleh dana penghargaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equals("PKM")) {
            // Input tambahan khusus PKM
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = scanner.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPendanaan = scanner.nextInt();

            // Nested IF Tingkat 2: Cek Kelengkapan Dokumen
            if (jumlahDokumen == 4) {
                // Nested IF Tingkat 3: Cek Status Pendanaan
                if (statusPendanaan == 1) {
                    System.out.println("Status : Dokumen lengkap. Selamat, Anda berhak menerima dana penghargaan!");
                } else {
                    System.out.println("Status : Dokumen lengkap, namun tim yang tidak lolos pendanaan tidak memperoleh dana penghargaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else {
            // Kegiatan Lainnya
            System.out.println("Status : Kegiatan di luar ketentuan (Lainnya) tidak memperoleh dana penghargaan.");
        }

        scanner.close();
    }
}