import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dinamis
        System.out.print("Masukkan Lebar Tanah (m): ");
        double lebarTanah = input.nextDouble();

        System.out.print("Masukkan Panjang Tanah (m): ");
        double panjangTanah = input.nextDouble();

        System.out.print("Masukkan Diameter Kolam (m): ");
        double diameterKolam = input.nextDouble();

        System.out.print("Masukkan Panjang Sisi Taman Persegi (m): ");
        double sisiPersegi = input.nextDouble();

        // Perhitungan
        double luasTanah = panjangTanah * lebarTanah;
        double r = diameterKolam / 2.0;
        double luasKolam = Math.PI * r * r;
        double luasTaman = sisiPersegi * sisiPersegi;
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        // Output
        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Luas Tanah Total        : " + luasTanah + " m2");
        System.out.println("Luas Tanah Tidak Terpakai: " + luasSisa + " m2");

        input.close();
    }
}