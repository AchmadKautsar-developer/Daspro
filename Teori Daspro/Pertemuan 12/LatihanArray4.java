public class LatihanArray4 {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {75, 80, 85, 90, 65, 70, 95, 85, 80, 90};
        int total = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i]; // Menjumlahkan seluruh nilai
        }

        double rataRata = (double) total / nilaiMahasiswa.length;
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}