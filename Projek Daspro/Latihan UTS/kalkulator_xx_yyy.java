import java.util.Scanner;

public class kalkulator_xx_yyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dua bilangan bertipe double
        System.out.print("Masukkan Bilangan 1: ");
        double bil1 = sc.nextDouble();

        System.out.print("Masukkan Bilangan 2: ");
        double bil2 = sc.nextDouble();

        // Input operator
        System.out.print("Masukkan Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        // Operasi kalkulator menggunakan switch-case dan if bersarang
        switch (operator) {
            case '+':
                System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
                break;
            case '-':
                System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
                break;
            case '*':
                System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
                break;
            case '/':
                // Memeriksa pembagian dengan nol menggunakan if bersarang
                if (bil2 == 0) {
                    System.out.println("Error: pembagian dengan nol");
                } else {
                    System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
                }
                break;
            case '%':
                // Memeriksa pembagian dengan nol pada operasi modulus
                if (bil2 == 0) {
                    System.out.println("Error: pembagian dengan nol");
                } else {
                    System.out.println(bil1 + " % " + bil2 + " = " + (bil1 % bil2));
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }

        sc.close();
    }
}
