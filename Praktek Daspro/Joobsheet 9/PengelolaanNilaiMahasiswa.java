import java.util.Scanner;

public class PengelolaanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumlahMhs = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMhs];
        int total = 0;
        double rata2 = 0;

        System.out.println("\n--- Masukkan Nilai Mahasiswa ---");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            total += nilaiMahasiswa[i]; // Akumulasi total nilai
        }

        if (jumlahMhs > 0) {
            rata2 = (double) total / nilaiMahasiswa.length;
        }

        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];

        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }

        System.out.println("\n==================================================");
        System.out.println("           REKAPITULASI NILAI MAHASISWA           ");
        System.out.println("==================================================");
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            String status = (nilaiMahasiswa[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMahasiswa[i] + " (" + status + ")");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total Nilai     : " + total);
        System.out.println("Nilai Rata-rata : " + rata2);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("==================================================");

        input.close();
    }
}