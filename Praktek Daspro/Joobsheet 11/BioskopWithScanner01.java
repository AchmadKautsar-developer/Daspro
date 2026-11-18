import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                sc.next();
                continue;
            }
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        
                        System.out.print("Masukkan baris (1-4): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan ulangi.");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Peringatan: Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Pilih kursi lain.");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        String lanjut = sc.nextLine();
                        if (lanjut.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Jika kursi kosong (null), tampilkan '***' (Pertanyaan Percobaan 2 no. 5)
                            String infoPenonton = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + infoPenonton + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program. Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}