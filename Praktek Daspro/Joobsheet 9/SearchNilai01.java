import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // =====================================================================
        // BAGIAN A: LINEAR SEARCH (PENCARIAN DATA)
        // =====================================================================
        System.out.println("=== BAGIAN A: LINEAR SEARCH (ASLI & MODIFIKASI) ===");

        // 1. KODE ASLI BAGIAN A
        int[] nilaiAsli = {78, 65, 90, 55, 88, 72};
        int keyAsli = 90;
        boolean ditemukanAsli = false;

        // Proses Linear Search versi Asli
        for (int i = 0; i < nilaiAsli.length; i++) {
            if (nilaiAsli[i] == keyAsli) {
                System.out.println("Nilai " + keyAsli + " ditemukan pada indeks ke-" + i);
                ditemukanAsli = true;
                break; 
            }
        }
        if (!ditemukanAsli) {
            System.out.println("Nilai " + keyAsli + " tidak ditemukan.");
        }

        // 2. KODE MODIFIKASI BAGIAN A
        System.out.println("\n--- Modifikasi Linear Search (Input Dinamis) ---");
        System.out.print("Masukkan jumlah elemen array yang ingin dibuat: ");
        int n = input.nextInt();
        int[] nilaiModif = new int[n];

        System.out.println("Masukkan " + n + " angka untuk elemen array:");
        for (int i = 0; i < nilaiModif.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            nilaiModif[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int keyModif = input.nextInt();

        boolean ditemukanModif = false;
        int indeksKetemu = -1;

        for (int i = 0; i < nilaiModif.length; i++) {
            if (nilaiModif[i] == keyModif) {
                ditemukanModif = true;
                indeksKetemu = i;
                break; 
            }
        }

        if (ditemukanModif) {
            System.out.println("Sukses! Nilai " + keyModif + " ditemukan pada posisi indeks ke-" + indeksKetemu);
        } else {
            System.out.println("Maaf, nilai yang dicari (" + keyModif + ") tidak ditemukan di dalam array.");
        }

        // =====================================================================
        // BAGIAN B: BUBBLE SORT (PENGURUTAN DATA)
        // =====================================================================
        System.out.println("\n=================================================");
        System.out.println("=== BAGIAN B: BUBBLE SORT (ASLI & MODIFIKASI) ===");

        // 1. KODE ASLI BAGIAN B
        int[] nilaiBubble1 = {78, 65, 90, 55, 88, 72};
        System.out.println("Array sebelum sorting (Ascending): " + Arrays.toString(nilaiBubble1));

        for (int i = 0; i < nilaiBubble1.length - 1; i++) {
            for (int j = 0; j < nilaiBubble1.length - 1 - i; j++) {
                if (nilaiBubble1[j] > nilaiBubble1[j + 1]) {
                    int temp = nilaiBubble1[j];
                    nilaiBubble1[j] = nilaiBubble1[j + 1];
                    nilaiBubble1[j + 1] = temp;
                }
            }
        }
        System.out.println("Array setelah sorting (Ascending): " + Arrays.toString(nilaiBubble1));

        // 2. KODE MODIFIKASI BAGIAN B
        int[] nilaiBubble2 = {78, 65, 90, 55, 88, 72};
        System.out.println("\nArray sebelum sorting (Descending): " + Arrays.toString(nilaiBubble2));

        for (int i = 0; i < nilaiBubble2.length - 1; i++) {
            for (int j = 0; j < nilaiBubble2.length - 1 - i; j++) {
                if (nilaiBubble2[j] < nilaiBubble2[j + 1]) {
                    int temp = nilaiBubble2[j];
                    nilaiBubble2[j] = nilaiBubble2[j + 1];
                    nilaiBubble2[j + 1] = temp;
                }
            }
        }
        System.out.println("Array setelah sorting (Descending): " + Arrays.toString(nilaiBubble2));

        input.close();
    }
}