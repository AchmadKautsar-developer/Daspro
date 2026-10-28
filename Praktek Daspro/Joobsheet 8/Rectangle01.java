import java.util.Scanner;

public class Rectangle01 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukkan jumlah baris: "); 
        int baris = sc.nextInt(); 

        System.out.print("Masukkan jumlah kolom: "); 
        int kolom = sc.nextInt(); 

        for (int i = 1; i <= baris; i++) {           
            for (int j = 1; j <= kolom; j++) { 
                System.out.print("*"); 
            }
            
            System.out.println();
        } 


        //Modifikasi
        System.out.print("Masukkan jumlah baris: "); 
        int baris1 = sc.nextInt(); 

        System.out.print("Masukkan jumlah kolom: "); 
        int kolom1 = sc.nextInt(); 

        for (int i = 1; i <= baris1; i++) {           
            for (int j = 1; j <= kolom1; j++) { 
                System.out.print("#"); // Karakter diubah menjadi pagar (#)
            }
            System.out.println(); 
        }
        sc.close();
    } 
}