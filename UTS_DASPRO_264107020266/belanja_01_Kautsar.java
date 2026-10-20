package UTS_DASPRO_264107020266;

import java.util.Scanner;

public class belanja_01_Kautsar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah member? (ya/tidak): ");
        String statusMember = sc.next();

        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = sc.nextDouble();

        if (totalBelanja < 0) {
            System.out.println("Total Belanja Tidak Valid");
        } else {

            double persenDiskon = 0;

            if (statusMember.equalsIgnoreCase("ya")) {
                if (totalBelanja >= 500000) {
                    persenDiskon = 0.20; 
                } else if (totalBelanja >= 200000) {
                    persenDiskon = 0.10;
                } else {
                    persenDiskon = 0.05;
                }
            } else if (statusMember.equalsIgnoreCase("tidak")) {
                if (totalBelanja >= 500000) {
                    persenDiskon = 0.10; 
                } else {
                    persenDiskon = 0;
                }
            } else {
                System.out.println("Status member tidak valid!");
                sc.close();
                return;
            }

            double besarDiskon = totalBelanja * persenDiskon;
            double totalBayar = totalBelanja - besarDiskon;

            System.out.println("Diskon: " + (int)(persenDiskon * 100) + "%");
            System.out.println("Besar Diskon: Rp" + (long)besarDiskon);
            System.out.println("Total Bayar: Rp"  + (long)totalBayar);
           
        }
        sc.close();
    }
}
