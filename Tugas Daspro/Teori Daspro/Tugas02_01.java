import java.util.Scanner;

public class Tugas02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double panjangTanah;
        double lebarTanah;
        double diameterKolam;
        double sisiTaman;
        double luasTanah;
        double jariJari;
        double luasKolam;
        double luasTaman;
        double luasSisa;

        // Input
        System.out.print("Masukkan panjang tanah (m): ");
        panjangTanah = input.nextDouble();

        System.out.print("Masukkan lebar tanah (m): ");
        lebarTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam ikan (m): ");
        diameterKolam = input.nextDouble();

        System.out.print("Masukkan sisi taman bunga (m): ");
        sisiTaman = input.nextDouble();

        // Proses
        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;
        luasSisa = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("Luas tanah keseluruhan : " + luasTanah + " m2");
        System.out.println("Luas kolam ikan         : " + luasKolam + " m2");
        System.out.println("Luas taman bunga        : " + luasTaman + " m2");
        System.out.println("Luas tanah tidak digunakan: " + luasSisa + " m2");

        input.close();
    }
}
