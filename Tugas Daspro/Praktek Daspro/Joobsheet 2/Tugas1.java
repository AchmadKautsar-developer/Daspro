import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dinamis
        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan Tunjangan Anak per Bulan: ");
        double tunjanganPerAnak = input.nextDouble();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        // Perhitungan
        double totalTunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * 0.10; // Potongan 10%
        double gajiBersih = (gajiPokok + totalTunjanganAnak) - potonganPensiun;

        // Output
        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Gaji Bersih Diterima: Rp " + gajiBersih);

        input.close();
    }
}