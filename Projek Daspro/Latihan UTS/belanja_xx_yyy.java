import java.util.Scanner;

public class belanja_xx_yyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input status member dan total belanja
        System.out.print("Apakah member? (ya/tidak): ");
        String statusMember = sc.next();

        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = sc.nextDouble();

        // Validasi jika total belanja bernilai negatif
        if (totalBelanja < 0) {
            System.out.println("Total belanja tidak valid");
        } else {
            double persenDiskon = 0;

            // Struktur if bersarang berdasarkan status member
            if (statusMember.equalsIgnoreCase("ya")) {
                if (totalBelanja >= 500000) {
                    persenDiskon = 0.20; // 20%
                } else if (totalBelanja >= 200000) {
                    persenDiskon = 0.10; // 10%
                } else {
                    persenDiskon = 0.05; // 5%
                }
            } else if (statusMember.equalsIgnoreCase("tidak")) {
                if (totalBelanja >= 500000) {
                    persenDiskon = 0.10; // 10%
                } else {
                    persenDiskon = 0;    // Tidak ada diskon
                }
            } else {
                System.out.println("Status member tidak valid!");
                sc.close();
                return;
            }

            // Perhitungan besar diskon dan total bayar
            double besarDiskon = totalBelanja * persenDiskon;
            double totalBayar = totalBelanja - besarDiskon;

            // Output hasil
            System.out.println("Diskon: " + (int)(persenDiskon * 100) + "%");
            System.out.println("Besar Diskon: Rp" + (long)besarDiskon);
            System.out.println("Total Bayar: Rp" + (long)totalBayar);
        }

        sc.close();
    }
}