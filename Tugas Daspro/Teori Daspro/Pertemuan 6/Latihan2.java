import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        double diskon = 0;

        // Pengondisian menggunakan operator logika (&&)
        if (jenisBuku.equals("kamus") && jumlahBuku > 2) {
            diskon = 0.12; // 10% + 2%
        } else if (jenisBuku.equals("kamus") && jumlahBuku <= 2) {
            diskon = 0.10; // 10%
        } else if (jenisBuku.equals("novel") && jumlahBuku > 3) {
            diskon = 0.09; // 7% + 2%
        } else if (jenisBuku.equals("novel") && jumlahBuku <= 3) {
            diskon = 0.08; // 7% + 1%
        } else if (jumlahBuku > 3) {
            diskon = 0.05; // 5% untuk selain kamus dan novel jika > 3
        } else {
            diskon = 0.0;
        }

        // Output jumlah diskon dalam bentuk persentase
        System.out.println("Jumlah diskon: " + (diskon * 100) + "%");

        sc.close();
    }
}