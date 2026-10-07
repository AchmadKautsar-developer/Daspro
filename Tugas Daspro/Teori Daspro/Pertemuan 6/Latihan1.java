import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 bilangan
        System.out.print("Masukkan bil1: ");
        int bil1 = sc.nextInt();
        
        System.out.print("Masukkan bil2: ");
        int bil2 = sc.nextInt();
        
        System.out.print("Masukkan bil3: ");
        int bil3 = sc.nextInt();

        int max;

        // Pemilihan keputusan bersarang (nested if) tanpa operator logika (AND/OR)
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                max = bil1;
            } else {
                max = bil3;
            }
        } else {
            if (bil2 > bil3) {
                max = bil2;
            } else {
                max = bil3;
            }
        }

        // Output hasil
        System.out.println("bilangan terbesar : " + max);

        sc.close();
    }
}