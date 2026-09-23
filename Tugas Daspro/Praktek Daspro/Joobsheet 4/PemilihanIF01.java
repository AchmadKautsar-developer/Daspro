import java.util.Scanner;

public class PemilihanIF01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT Sudah Lunas? (True/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRs dan Minta Tanda Tangan DPA");
        }

        sc.close();
    }
}
