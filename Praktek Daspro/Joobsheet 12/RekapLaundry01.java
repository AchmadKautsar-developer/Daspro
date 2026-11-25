import java.util.Scanner;

public class RekapLaundry01 {
    static void inputBeratCucian(Scanner sc, int[][] data, String[] layanan) {
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input berat cucian untuk layanan: " + layanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " (kg): ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilTabel(int[][] data, String[] layanan, int[] hargaPerKg) {
        int jumlahHari = data[0].length;
        System.out.println("\n=== TABEL REKAP BERAT CUCIAN (KG) ===");
        System.out.printf("%-18s | %-10s", "Layanan", "Harga/kg");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf(" | %-8s", "Hari ke-" + h);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s | Rp%-8d", layanan[i], hargaPerKg[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf(" | %-8d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(int[][] data, String[] layanan) {
        int idxMax = 0;
        int maxTotal = totalPerLayanan(data, 0);
        for (int i = 1; i < data.length; i++) {
            int t = totalPerLayanan(data, i);
            if (t > maxTotal) {
                maxTotal = t;
                idxMax = i;
            }
        }
        System.out.println("Layanan berat tertinggi: " + layanan[idxMax] + " (" + maxTotal + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int jumlahHari = data[0].length;
        int idxHariMax = 0;
        int maxHari = 0;

        for (int j = 0; j < jumlahHari; j++) {
            int sumHari = 0;
            for (int i = 0; i < data.length; i++) {
                sumHari += data[i][j];
            }
            if (j == 0 || sumHari > maxHari) {
                maxHari = sumHari;
                idxHariMax = j;
            }
        }
        return idxHariMax;
    }

    static void tampilPendapatan(int[][] data, String[] layanan, int[] hargaPerKg) {
        int totalPendapatan = 0;
        System.out.println("\n=== PENDAPATAN PER LAYANAN ===");
        for (int i = 0; i < data.length; i++) {
            int totalKg = totalPerLayanan(data, i);
            int pendapatanLayanan = totalKg * hargaPerKg[i];
            totalPendapatan += pendapatanLayanan;
            System.out.printf("%-18s : %d kg x Rp%d = Rp%d%n",
                    layanan[i], totalKg, hargaPerKg[i], pendapatanLayanan);
        }
        System.out.println("Total Pendapatan Keseluruhan: Rp" + totalPendapatan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis layanan: ");
        int jumlahLayanan = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String[] layanan = new String[jumlahLayanan];
        int[] hargaPerKg = new int[jumlahLayanan];
        int[][] data = new int[jumlahLayanan][jumlahHari];

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = sc.nextLine();
            System.out.print("Harga per kg untuk " + layanan[i] + ": Rp");
            hargaPerKg[i] = sc.nextInt();
            sc.nextLine();
        }

        inputBeratCucian(sc, data, layanan);
        tampilTabel(data, layanan, hargaPerKg);

        System.out.println("\n=== RINGKASAN BERAT & HARI TERSIBUK ===");
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.println("Total berat " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }
        tampilLayananTertinggi(data, layanan);

        int idxTersibuk = hariTersibuk(data);
        System.out.println("Hari tersibuk: Hari ke-" + (idxTersibuk + 1));

        tampilPendapatan(data, layanan, hargaPerKg);

        sc.close();
    }
}