import java.util.Scanner;

public class kafe03_01 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskonPromo = 0;
        if (kodePromo.equals("DISKON50")) {
            diskonPromo = (total * 50) / 100;
        } else if (kodePromo.equals("DISKON30")) {
            diskonPromo = (total * 30) / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        int diskonMember = 0;
        if (isMember) {
            diskonMember = (total * 10) / 100;
        }

        return diskonPromo + diskonMember;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        System.out.print("\nMasukkan jumlah jenis menu yang ingin dipesan: ");
        int jumlahJenis = sc.nextInt();
        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            int pilihanMenu;
            while (true) {
                System.out.print("Masukkan nomor menu ke-" + i + " (1-6): ");
                pilihanMenu = sc.nextInt();
                if (pilihanMenu >= 1 && pilihanMenu <= 6) {
                    break;
                } else {
                    System.out.println("Menu tidak tersedia");
                }
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int subtotal = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            totalKeseluruhan += subtotal;
        }

        sc.nextLine();
        System.out.print("Masukkan kode promo (atau kosongkan): ");
        String kodePromo = sc.nextLine();

        int diskon = hitungDiskon(totalKeseluruhan, kodePromo, true);
        int totalBayar = totalKeseluruhan - diskon;

        System.out.println("Total harga pesanan : Rp" + totalKeseluruhan);
        System.out.println("Besar diskon        : Rp" + diskon);
        System.out.println("Total harus dibayar : Rp" + totalBayar);
        sc.close();
    }
}