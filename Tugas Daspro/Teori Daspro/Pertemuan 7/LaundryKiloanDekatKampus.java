import java.util.Scanner;

public class LaundryKiloanDekatKampus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat cucian
        System.out.print("Masukkan berat cucian (kg): ");
        int berat = scanner.nextInt();

        int tarifPerKg;

        // Penentuan tarif per kg menggunakan struktur if - else if - else
        if (berat < 3) {
            tarifPerKg = 7000;
        } else if (berat <= 6) {
            tarifPerKg = 6000;
        } else {
            tarifPerKg = 5000;
        }

        // Perhitungan total biaya
        int totalBiaya = berat * tarifPerKg;

        // Menampilkan hasil
        System.out.println("Tarif per kg : Rp" + tarifPerKg);
        System.out.println("Total biaya  : Rp" + totalBiaya);

        scanner.close();
    }
}