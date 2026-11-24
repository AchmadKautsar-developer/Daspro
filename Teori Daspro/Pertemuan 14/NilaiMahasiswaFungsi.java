import java.util.Scanner;

public class NilaiMahasiswaFungsi {
    static final int JUMLAH_MHS = 5;
    static final int JUMLAH_KOMPONEN = 3; 

    static void bacaData(Scanner sc, String[] nama, double[][] nilai) {
        String[] komponen = {"Tugas (30%)", "Kuis (30%)", "Ujian Praktikum (40%)"};
        for (int i = 0; i < JUMLAH_MHS; i++) {
            System.out.println("\n--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("Nama Mahasiswa: ");
            nama[i] = sc.nextLine();
            for (int j = 0; j < JUMLAH_KOMPONEN; j++) {
                System.out.print("  Nilai " + komponen[j] + ": ");
                nilai[i][j] = sc.nextDouble();
            }
            sc.nextLine(); 
        }
    }

    static double[] hitungNilaiAkhir(double[][] nilai) {
        double[] akhir = new double[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            akhir[i] = (0.30 * nilai[i][0]) + (0.30 * nilai[i][1]) + (0.40 * nilai[i][2]);
        }
        return akhir;
    }

    static String[] tentukanStatus(double[] nilaiAkhir) {
        String[] status = new String[nilaiAkhir.length];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            status[i] = (nilaiAkhir[i] >= 70) ? "LULUS" : "TIDAK LULUS";
        }
        return status;
    }

    static int cariTertinggi(double[] nilaiAkhir) {
        int idxMax = 0;
        for (int i = 1; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > nilaiAkhir[idxMax]) {
                idxMax = i;
            }
        }
        return idxMax;
    }

    static void tampilHasil(String[] nama, double[] nilaiAkhir, String[] status, int idxTertinggi) {
        System.out.println("\n============================================================");
        System.out.printf("%-20s | %-12s | %-12s%n", "Nama Mahasiswa", "Nilai Akhir", "Status");
        System.out.println("============================================================");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-20s | %-12.2f | %-12s%n", nama[i], nilaiAkhir[i], status[i]);
        }
        System.out.println("============================================================");
        System.out.printf("Nilai Akhir Tertinggi: %s (%.2f)%n", nama[idxTertinggi], nilaiAkhir[idxTertinggi]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = new String[JUMLAH_MHS];
        double[][] nilai = new double[JUMLAH_MHS][JUMLAH_KOMPONEN];

        bacaData(sc, nama, nilai);
        double[] nilaiAkhir = hitungNilaiAkhir(nilai);
        String[] status = tentukanStatus(nilaiAkhir);
        int idxTertinggi = cariTertinggi(nilaiAkhir);

        tampilHasil(nama, nilaiAkhir, status, idxTertinggi);

        sc.close();
    }
}
