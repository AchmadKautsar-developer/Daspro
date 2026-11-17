public class LatihanArray5 {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {75, 85, 90, 85, 60, 95, 85};
        int n = 85; 
        boolean ditemukan = false;

        System.out.println("Mencari nilai " + n + ":");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] == n) {
                System.out.println("Ditemukan pada indeks ke-" + i);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai tidak ditemukan dalam array.");
        }
    }
}