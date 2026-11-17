import java.util.Scanner;

public class Tugas3_SurveiKepuasan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] survei = new int[10][6];

        System.out.println("=== MASUKKAN DATA HASIL SURVEI (Nilai 1 - 5) ===");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("  Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = scanner.nextInt();
            }
        }

        System.out.println("      RATA-RATA NILAI UNTUK SETIAP RESPONDEN      ");

        double totalSemuaNilai = 0;
        int totalElemen = survei.length * survei[0].length;

        for (int i = 0; i < survei.length; i++) {
            double totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
                totalSemuaNilai += survei[i][j];
            }
            double rataResponden = totalResponden / survei[i].length;
            System.out.printf("Responden ke-%2d : %.2f\n", (i + 1), rataResponden);
        }

        System.out.println("\n==================================================");
        System.out.println("      RATA-RATA NILAI UNTUK SETIAP PERTANYAAN     ");

        for (int j = 0; j < survei[0].length; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / survei.length;
            System.out.printf("Pertanyaan ke-%2d : %.2f\n", (j + 1), rataPertanyaan);
        }

        double rataKeseluruhan = totalSemuaNilai / totalElemen;

        System.out.printf("RATA-RATA NILAI KESELURUHAN : %.2f\n", rataKeseluruhan);

        scanner.close();
    }
}