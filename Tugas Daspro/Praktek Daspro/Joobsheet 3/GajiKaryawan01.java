import java.util.Scanner;

public class GajiKaryawan01{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            int gajiPokok;
            double bonus, totalGaji;
            double tunjanganTransparan = 6000000;
            double tunjanganMakan = 4000000;
            gajiPokok = sc.nextInt();
            bonus = 0.05 * gajiPokok;
            totalGaji = gajiPokok + tunjanganTransparan + tunjanganMakan + bonus - (1 * gajiPokok);
            System.out.println("Bonus Bulanan anda adalah Rp. " +bonus);
            System.out.println("Gaji yang diterima adalah Rp. " +totalGaji);

        sc.close();

    }
}