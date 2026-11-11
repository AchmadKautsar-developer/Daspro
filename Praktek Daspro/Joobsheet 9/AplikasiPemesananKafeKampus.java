import java.util.Scanner;

public class AplikasiPemesananKafeKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("==========================================");
        System.out.println("          DAFTAR MENU KAFE KAMPUS         ");
        System.out.println("==========================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("==========================================");

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = input.nextLine();
        
        boolean menuDitemukan = false;
        int indeksMenu = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                menuDitemukan = true;
                indeksMenu = i;
                break;
            }
        }

        if (menuDitemukan) {
            System.out.println("-> Menu '" + menu[indeksMenu] + "' tersedia dengan harga: Rp " + harga[indeksMenu]);
        } else {
            System.out.println("-> Mohon maaf, menu '" + cariMenu + "' tidak tersedia di kafe ini.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // Membersihkan buffer newline

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiayaKeseluruhan = 0;

        System.out.println("\n--- SILAKAN MASUKKAN PESANAN ANDA ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            boolean menuValid = false;
            int idxHarga = -1;

            while (!menuValid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaPesananInput = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesananInput)) {
                        menuValid = true;
                        idxHarga = j;
                        break;
                    }
                }

                if (!menuValid) {
                    System.out.println("Menu tidak valid atau tidak ada di daftar. Silakan masukkan ulang!");
                }
            }

            System.out.print("Masukkan jumlah porsi untuk " + menu[idxHarga] + ": ");
            int jmlPorsi = input.nextInt();
            input.nextLine(); 

            pesananNama[i] = menu[idxHarga];
            pesananJumlah[i] = jmlPorsi;
            pesananSubtotal[i] = harga[idxHarga] * jmlPorsi;

            totalBiayaKeseluruhan += pesananSubtotal[i];
        }

        System.out.println("\n==================================================");
        System.out.println("               STRUK PEMESANAN KAFE               ");
        System.out.println("==================================================");
        System.out.printf("%-20s | %-6s | %-12s\n", "Nama Menu", "Jumlah", "Subtotal");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s | %-6d | Rp %-9d\n", pesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }

        System.out.println("==================================================");
        System.out.println("TOTAL BIAYA KESELURUHAN : Rp " + totalBiayaKeseluruhan);
        System.out.println("==================================================");
        System.out.println("Terima kasih telah berkunjung di Kafe Kampus!");

        input.close();
    }
}