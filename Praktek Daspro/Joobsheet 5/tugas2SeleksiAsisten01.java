import java.util.Scanner;

public class tugas2SeleksiAsisten01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SELEKSI CALON ASISTEN PRAKTIKUM ===");

        // Step 1: Input Status Kemahasiswaan
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang dalam sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        // Level 1: Cek Status Aktif & Bebas Sanksi
        if (mahasiswaAktif && !sedangDisanksi) {

            // Step 2: Input Nilai & Sertifikat
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            double nilaiDaspro = sc.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            // Level 2: Cek Nilai Daspro >= 80 ATAU Punya Sertifikat
            if (nilaiDaspro >= 80 || punyaSertifikat) {

                // Step 3: Input Nilai Wawancara
                System.out.print("Masukkan nilai wawancara: ");
                double nilaiWawancara = sc.nextDouble();

                // Level 3: Cek Nilai Wawancara >= 75
                if (nilaiWawancara >= 75) {
                    System.out.println("\nSelamat! Anda DITERIMA sebagai Asisten Praktikum.");
                } else {
                    System.out.println("\nGagal! Nilai wawancara kurang dari 75 (Nilai Anda: " + nilaiWawancara + ").");
                }

            } else {
                System.out.println("\nGagal! Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("\nGagal! Status mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }

        sc.close();
    }
}