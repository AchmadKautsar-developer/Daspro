import java.util.Scanner;

public class TabungKerucut01 {
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }

    static double luasPermukaanTabung(double r, double t) {
        return 2 * luasLingkaran(r) + 2 * Math.PI * r * t;
    }

    static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("\n=== MENU TABUNG & KERUCUT (ABSEN GANJIL) ===");
            System.out.println("1. Volume Tabung");
            System.out.println("2. Luas Permukaan Tabung");
            System.out.println("3. Volume Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            if (menu == 1 || menu == 2 || menu == 3) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double t = sc.nextDouble();

                if (menu == 1) {
                    System.out.printf("Volume Tabung: %.2f%n", volumeTabung(r, t));
                } else if (menu == 2) {
                    System.out.printf("Luas Permukaan Tabung: %.2f%n", luasPermukaanTabung(r, t));
                } else {
                    System.out.printf("Volume Kerucut: %.2f%n", volumeKerucut(r, t));
                }
            } else if (menu != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);

        sc.close();
    }
}