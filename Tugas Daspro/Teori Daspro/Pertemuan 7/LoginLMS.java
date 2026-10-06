import java.util.Scanner;

public class LoginLMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Password yang tersimpan di sistem
        final String PASSWORD_BENAR = "daspro2026";

        // Input 3 data masukan
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        System.out.print("Status perangkat (Y = terdaftar, T = baru): ");
        char perangkat = scanner.next().toUpperCase().charAt(0);

        System.out.print("Jumlah login gagal sebelumnya (0 - 2): ");
        int jumlahGagal = scanner.nextInt();

        // Nested IF (Tingkat 1: Cek Password)
        if (password.equals(PASSWORD_BENAR)) {
            // Nested IF (Tingkat 2: Cek Perangkat)
            if (perangkat == 'Y') {
                System.out.println("Login berhasil, selamat datang di dashboard");
            } else {
                System.out.println("Kode OTP telah dikirim ke email kampus Anda");
            }
        } else {
            // Nested IF (Tingkat 2: Cek Jumlah Gagal)
            if (jumlahGagal == 2) {
                System.out.println("Akun dikunci selama 15 menit");
            } else {
                System.out.println("Password salah, silakan coba lagi");
            }
        }

        scanner.close();
    }
}
