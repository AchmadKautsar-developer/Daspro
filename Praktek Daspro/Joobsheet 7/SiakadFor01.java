import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double nilai, tertinggi =0, terendah = 0;

      for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
          tertinggi = nilai;
        }
        if (nilai < terendah || terendah == 0) {
          terendah = nilai;
        }
      }
      System.out.println("Nilai tertinggi: " + tertinggi);
      System.out.println("Nilai terendah: " + terendah);

    }
}
