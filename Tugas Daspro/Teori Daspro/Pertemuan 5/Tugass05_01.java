import java.util.Scanner;

public class Tugass05_01 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Pilih Layanan: ");
        int Layanan = sc.nextInt();

        switch (Layanan) {
            case 1:
                System.out.println("Loket A");
                break;
            case 2:
                System.out.println("Loket B");
                break;
            case 3:
                System.out.println("Loket C");
                break;
            case 4:
                System.out.println("Loket D");
                break;
            default:
                System.out.println("Terimakasih");
                break;
        }
        sc.close();
    }
}
