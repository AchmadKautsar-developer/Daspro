import java.util.Scanner;

public class MenghitungTotalBayar01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int harga;
            double potongan;
            double jlm_bayar;
            double diskon = 0.15;

       harga = sc.nextInt();
         potongan = harga * diskon;
         jlm_bayar = harga - potongan;
         System.out.println("jumlah yang harus anda bayar adalah Rp. " + jlm_bayar);

         sc.close();

    }
}
