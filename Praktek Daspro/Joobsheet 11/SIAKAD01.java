import java.util.Scanner;

public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("  Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.printf("-> Nilai rata-rata mahasiswa ke-%d: %.2f\n", (i + 1), (totalPerSiswa / nilai[i].length));
        }

        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.printf("Mata kuliah %d: %.2f\n", (j + 1), (totalPerMatkul / nilai.length));
        }
    
        sc.close();
    }
}
