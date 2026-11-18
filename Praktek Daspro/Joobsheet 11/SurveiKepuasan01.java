import java.util.Scanner;

public class SurveiKepuasan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
        double totalSemuaNilai = 0;

        System.out.println("=== MASUKKAN DATA SURVEI KEPUASAN (Skala 1 - 5) ===");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                while (true) {
                    System.out.print("  Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        survei[i][j] = nilai;
                        totalSemuaNilai += nilai;
                        break;
                    } else {
                        System.out.println("  Nilai harus antara 1 sampai 5. Coba lagi.");
                    }
                }
            }
        }

        System.out.println("\n==================================================");
        System.out.println("      RATA-RATA NILAI UNTUK SETIAP RESPONDEN      ");
        System.out.println("==================================================");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = totalResponden / JUMLAH_PERTANYAAN;
            System.out.printf("Responden ke-%2d : %.2f\n", (i + 1), rataResponden);
        }

        System.out.println("\n==================================================");
        System.out.println("      RATA-RATA NILAI UNTUK SETIAP PERTANYAAN     ");
        System.out.println("==================================================");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / JUMLAH_RESPONDEN;
            System.out.printf("Pertanyaan ke-%2d : %.2f\n", (j + 1), rataPertanyaan);
        }

        double rataKeseluruhan = totalSemuaNilai / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
        System.out.println("\n==================================================");
        System.out.printf("RATA-RATA NILAI KESELURUHAN : %.2f\n", rataKeseluruhan);
        System.out.println("==================================================");

        sc.close();
    }
}