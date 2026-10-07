import java.util.Scanner;

public class AturanSeragamPerkuliahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kode hari
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = scanner.nextInt();

        // Switch case untuk memeriksa kode hari
        switch (kodeHari) {
            case 1:
            case 2:
            case 5:
                // Hari Senin, Selasa, Jumat
                System.out.print("Apakah memakai seragam? (Y/T): ");
                char statusSeragam = scanner.next().toUpperCase().charAt(0);

                // Pemilihan if-else untuk status seragam
                if (statusSeragam == 'Y') {
                    System.out.println("Boleh mengikuti perkuliahan.");
                } else {
                    System.out.println("Dikenakan sanksi dan tidak boleh mengikuti perkuliahan.");
                }
                break;

            case 3:
            case 4:
                // Hari Rabu, Kamis
                System.out.println("Boleh memakai pakaian bebas yang rapi dan sopan.");
                break;

            case 6:
            case 7:
                // Hari Sabtu, Minggu
                System.out.println("Tidak ada perkuliahan.");
                break;

            default:
                // Kode di luar 1-7
                System.out.println("Kode hari tidak valid.");
                break;
        }

        scanner.close();
    }
}