import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tugas01_01 {

    // Konfigurasi Konstanta Bisnis
    private static final double GAJI_POKOK = 5000000.0;
    private static final double TUNJANGAN_PER_ANAK = 100000.0;
    private static final double PERSEN_PENSIUN = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================================");
        System.out.println("     SISTEM PENGGAJIAN KARYAWAN PT. XYZ          ");
        System.out.println("==================================================");

        // Input Nama Karyawan
        System.out.print("Masukkan Nama Karyawan         : ");
        String namaKaryawan = scanner.nextLine().trim();
        if (namaKaryawan.isEmpty()) {
            namaKaryawan = "Pak Danur";
        }

        // Input Jumlah Anak dengan Validasi
        int jumlahAnak = 0;
        boolean inputValid = false;
        
        while (!inputValid) {
            System.out.print("Masukkan Jumlah Anak           : ");
            String inputAnak = scanner.nextLine();
            try {
                jumlahAnak = Integer.parseInt(inputAnak);
                if (jumlahAnak < 0) {
                    System.out.println("[ERROR] Jumlah anak tidak boleh bernilai negatif!");
                } else {
                    inputValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Input harus berupa angka bulat valid!");
            }
        }

        // Eksekusi Kalkulasi Bisnis
        double totalTunjanganAnak = hitungTunjanganAnak(jumlahAnak);
        double potonganPensiun = hitungPotonganPensiun(GAJI_POKOK);
        double gajiBersih = hitungGajiBersih(GAJI_POKOK, totalTunjanganAnak, potonganPensiun);

        // Cetak Slip Gaji
        tampilkanSlipGaji(namaKaryawan, jumlahAnak, totalTunjanganAnak, potonganPensiun, gajiBersih);

        scanner.close();
    }

    // Business Logic Methods
    public static double hitungTunjanganAnak(int jumlahAnak) {
        return jumlahAnak * TUNJANGAN_PER_ANAK;
    }

    public static double hitungPotonganPensiun(double gajiPokok) {
        return gajiPokok * PERSEN_PENSIUN;
    }

    public static double hitungGajiBersih(double gajiPokok, double tunjangan, double potongan) {
        return gajiPokok + tunjangan - potongan;
    }

    // Utility Format Rupiah (Menggunakan Locale.of agar tidak deprecated)
    private static String formatRupiah(double nominal) {
        Locale localeID = Locale.of("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(nominal);
    }

    // Output Visualizer
    private static void tampilkanSlipGaji(String nama, int anak, double tunjangan, double potongan, double totalGaji) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("                SLIP GAJI KARYAWAN                ");
        System.out.println("--------------------------------------------------");
        System.out.printf(" Nama Karyawan        : %s%n", nama);
        System.out.printf(" Jumlah Anak          : %d anak%n", anak);
        System.out.println("--------------------------------------------------");
        System.out.printf(" Gaji Pokok           : %s%n", formatRupiah(GAJI_POKOK));
        System.out.printf(" Tunjangan Anak       : %s%n", formatRupiah(tunjangan));
        System.out.printf(" Potongan Pensiun(10%%): -%s%n", formatRupiah(potongan));
        System.out.println("--------------------------------------------------");
        System.out.printf(" GAJI BERSIH (NETTO)  : %s%n", formatRupiah(totalGaji));
        System.out.println("==================================================");

        // gaji pokok= integer 
        // jumlah anak= integer
        // tunjangan anak= double
        // potongan pensiun= double
        // gaji bersih= double
        // format rupiah= string
        // slip gaji= string
        // nama karyawan= string
        
    }
}

    

