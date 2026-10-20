
import java.util.Scanner;

public class BonusPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jumlah jam kerja: ");
            double jamKerja = input.nextDouble();

            if (jamKerja < 0) {
                System.out.println("Program dihentikan.");
                break;
            }

            System.out.print("Masukkan gaji harian: Rp");
            double gaji = input.nextDouble();

            double bonus = 0;

            if (jamKerja > 8) {
                bonus = gaji * 0.20;
            }

            System.out.println("Bonus pegawai: Rp" + bonus);
            System.out.println("----------------------");
        }

        input.close();
    }
}

