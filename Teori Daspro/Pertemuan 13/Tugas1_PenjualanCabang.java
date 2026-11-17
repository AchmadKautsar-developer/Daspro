public class Tugas1_PenjualanCabang {
    public static void main(String[] args) {
        int[][] penjualan = {
            {2, 8, 6},   // Dieng (Novel, Komik, Ensiklopedia)
            {7, 3, 6},   // Soehat
            {4, 6, 5}    // Sengkaling
        };

        String[] namaCabang = {"Dieng", "Soehat", "Sengkaling"};
        String[] namaKategori = {"Novel", "Komik", "Ensiklopedia"};

        int[] totalKolom = new int[penjualan[0].length];
        int grandTotal = 0;

        System.out.printf("%-15s | %-10s | %-10s | %-15s | %-8s\n", "Cabang / Kategori", namaKategori[0], namaKategori[1], namaKategori[2], "Total");;

        for (int i = 0; i < penjualan.length; i++) {
            int totalBaris = 0; 
            
            System.out.printf("%-15s | ", namaCabang[i]);

            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-10d | ", penjualan[i][j]);

                totalBaris += penjualan[i][j];
                totalKolom[j] += penjualan[i][j];
            }

            System.out.printf("%-8d\n", totalBaris);
            
            grandTotal += totalBaris;
        }

        System.out.printf("%-15s | ", "Total");
        for (int j = 0; j < totalKolom.length; j++) {
            System.out.printf("%-10d | ", totalKolom[j]);
        }

        System.out.printf("%-8d\n", grandTotal);

        System.out.println("TOTAL KESELURUHAN (GRAND TOTAL) = " + grandTotal);

    }
}