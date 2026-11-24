import java.util.Scanner;

public class KafeBuMariana {
    static final int JUMLAH_MENU = 5;
    static final int JUMLAH_HARI = 7;

    static int[][] inputPenjualan(Scanner sc, String[] menu) {
        int[][] data = new int[JUMLAH_MENU][JUMLAH_HARI];
        System.out.println("\n--- Input Data Penjualan (7 Hari) ---");
        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }

    static void tampilPenjualan(String[] menu, int[][] data) {
        System.out.println("\n=== REKAP PENJUALAN HARIAN ===");
        System.out.printf("%-18s", "Menu");
        for (int h = 1; h <= JUMLAH_HARI; h++) {
            System.out.printf("H%-5d", h);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s", menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-6d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int[] hitungTotal(int[][] data) {
        int[] total = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            total[i] = sum;
        }
        return total;
    }

    static int cariTerlaris(int[] total) {
        int idxMax = 0;
        for (int i = 1; i < total.length; i++) {
            if (total[i] > total[idxMax]) {
                idxMax = i;
            }
        }
        return idxMax;
    }

    static double[] hitungRataRata(int[] total, int jumlahHari) {
        double[] rata = new double[total.length];
        for (int i = 0; i < total.length; i++) {
            rata[i] = (double) total[i] / jumlahHari;
        }
        return rata;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5,  9,  20, 25, 10, 5,  45},
            {50, 8,  17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };

        System.out.print("Input data manual? (y/n): ");
        String jawab = sc.next();
        if (jawab.equalsIgnoreCase("y")) {
            penjualan = inputPenjualan(sc, menu);
        }

        tampilPenjualan(menu, penjualan);

        int[] totalMenu = hitungTotal(penjualan);
        double[] rataMenu = hitungRataRata(totalMenu, JUMLAH_HARI);
        int idxTerlaris = cariTerlaris(totalMenu);

        System.out.println("\n=== RINGKASAN PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-18s | Total: %-4d | Rata-rata/hari: %.2f%n",
                    menu[i], totalMenu[i], rataMenu[i]);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Menu Terlaris      : " + menu[idxTerlaris] + " (" + totalMenu[idxTerlaris] + " terjual)");

        sc.close();
    }
}