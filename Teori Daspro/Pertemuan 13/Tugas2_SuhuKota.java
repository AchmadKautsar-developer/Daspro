import java.util.Scanner;

public class Tugas2_SuhuKota {
    public static void main(String[] args) {

        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        String[] namaHari = {"Hari ke-1", "Hari ke-2", "Hari ke-3", "Hari ke-4", "Hari ke-5", "Hari ke-6", "Hari ke-7"};

        double[][] suhu = new double[5][7]; 
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SILAKAN MASUKKAN DATA SUHU KOTA ===");
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("Suhu di " + kota[i] + " hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        double suhuTertinggi = suhu[0][0];
        double suhuTerendah = suhu[0][0];
        
        int indeksKotaTertinggi = 0;
        int indeksHariTertinggi = 0;
        
        int indeksKotaTerendah = 0;
        int indeksHariTerendah = 0;

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                if (suhu[i][j] > suhuTertinggi) {
                    suhuTertinggi = suhu[i][j];
                    indeksKotaTertinggi = i;
                    indeksHariTertinggi = j;
                }

                if (suhu[i][j] < suhuTerendah) {
                    suhuTerendah = suhu[i][j];
                    indeksKotaTerendah = i;
                    indeksHariTerendah = j;
                }
            }
        }

        System.out.println("Suhu TERTINGGI tercatat sebesar : " + suhuTertinggi + " °C");
        System.out.println("-> Terjadi di Kota : " + kota[indeksKotaTertinggi]);
        System.out.println("-> Pada Waktu      : " + namaHari[indeksHariTertinggi]);

        System.out.println("Suhu TERENDAH tercatat sebesar  : " + suhuTerendah + " °C");
        System.out.println("-> Terjadi di Kota : " + kota[indeksKotaTerendah]);
        System.out.println("-> Pada Waktu      : " + namaHari[indeksHariTerendah]);

        sc.close();
    }
}