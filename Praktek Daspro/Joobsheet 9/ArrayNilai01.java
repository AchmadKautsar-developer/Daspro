import java.util.Scanner;

public class ArrayNilai01 {
    public static void main(String[] args) {
        // ==========================================
        // 1. KODE ASLI PERCOBAAN 
        // ==========================================
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println("\n--- HASIL KODE ASLI ---");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }


        // ==========================================
        // 2. KODE MODIFIKASI
        // ==========================================
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("\n--- HASIL REKAPITULASI MODIFIKASI ---");
        System.out.println("Total mahasiswa LULUS      : " + jumlahLulus);
        System.out.println("Total mahasiswa TIDAK LULUS: " + jumlahTidakLulus);

        input.close();
    }
}