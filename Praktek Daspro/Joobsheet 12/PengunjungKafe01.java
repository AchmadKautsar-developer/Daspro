public class PengunjungKafe01 {
   
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

   
    static void daftarPengunjungMeja(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja ke-" + nomorMeja + ":");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

   
    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();

        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);

        daftarPengunjungMeja(5, "Rina", "Sari");

        System.out.println("Total (1 item): " + hitungTotalBelanja(15000));
        System.out.println("Total (3 item): " + hitungTotalBelanja(15000, 20000, 12000));
        System.out.println("Total (5 item): " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }
}