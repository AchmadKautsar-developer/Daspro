import java.util.Scanner;

public class Tugas1Pemilihan01{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        // Menggunakan Ternary Operator dan menyimpan hasil keputusan ke dalam variabel pesan
        String pesan = uktLunas 
            ? "Pembayaran UKT Terverifikasi\nSilahkan Cetak KRS dan Minta Tanda Tangan DPA" 
            : "";
        
        // Mencetak pesan menggunakan satu perintah System.out.print / println
        System.out.print(pesan.isEmpty() ? "" : pesan + "\n");

        sc.close();
    }
}
