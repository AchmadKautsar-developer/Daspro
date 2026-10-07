import java.util.Scanner;

public class Tugas2Pemilihan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahSks;

        // Input jumlah SKS
        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = sc.nextInt();

        // Struktur pemilihan IF-ELSE sesuai flowchart
        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        sc.close();
    }
}