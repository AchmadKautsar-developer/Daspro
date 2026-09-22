import java.util.Scanner;

public class Tugas05_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (jam): ");
        int jam = input.nextInt();

        int tarif;
        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (jam - 2) * 1000;
        }

        System.out.println("Tarif parkir = Rp " + tarif);
        
        input.close();
    }
}
