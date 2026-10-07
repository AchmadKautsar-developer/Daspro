import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Merk Sepatu (Converse/Sketcher/Nike): ");
        String merk = sc.nextLine();

        System.out.print("Masukkan Kategori: ");
        String kategori = sc.nextLine();

        System.out.print("Masukkan Ukuran: ");
        int ukuran = sc.nextInt();

        int harga = 0;

        // Pengecekan tanpa operator logika (menggunakan nested if)
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga > 0) {
            System.out.println("Harga Sepatu: Rp " + harga);
        } else {
            System.out.println("Data sepatu atau ukuran tidak ditemukan.");
        }

        sc.close();
    }
}