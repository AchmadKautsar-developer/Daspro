import java.util.Scanner;

public class Bank01 {
    public static void main(String[] args) {
        // 4. Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        // 5. Deklarasi variabel dan tipe data
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        // 6. Perintah untuk menginputkan jml_tabungan_awal dan lama_menabung
        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        // 7. Perintah untuk menghitung bunga
        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;

        // 8. Perintah untuk menghitung jml_tabungan_akhir
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        // 9. Menampilkan isi variabel bunga dan jml_tabungan_akhir
        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

        input.close();
    }
}