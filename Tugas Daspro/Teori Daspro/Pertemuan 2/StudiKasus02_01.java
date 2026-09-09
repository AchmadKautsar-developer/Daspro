import java.util.Scanner;

public class StudiKasus02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jlm_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jlm_tabungan_akhir;
    
        System.out.print("Masukkan jumlah tabungan awal anda");
        jlm_tabungan_awal = input.nextInt();

        System.out.print("Masukkan lama menabung (bulan)");
        lama_menabung = input.nextInt();

       bunga= lama_menabung * presentase_bunga * jlm_tabungan_awal;
       jlm_tabungan_akhir = bunga + jlm_tabungan_awal;

       System.out.println("bunga adalah " + bunga);
       System.out.println("jumlah tabungan akhir adalah " + jlm_tabungan_akhir);
        input.close();
    }
}
