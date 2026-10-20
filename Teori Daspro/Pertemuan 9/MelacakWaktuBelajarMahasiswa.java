import java.util.Scanner;

public class MelacakWaktuBelajarMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalJam = 0;
        int hari = 1;

        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            double jam = input.nextDouble();

            if (jam < 0 || jam > 10) {
                System.out.println("Input tidak valid! Masukkan rentang 0-10 jam.");
                continue;
            }

            totalJam += jam;
            hari++;
        }

        System.out.println();
        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");

        if (totalJam >= 35) {
            System.out.println("Status: Sudah memenuhi target belajar selama seminggu.");
        } else {
            System.out.println("Status: Belum mencapai target belajar selama seminggu.");
        }

        input.close();
    }
}
