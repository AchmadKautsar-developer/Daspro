import java.util.Arrays;

public class ArrayBilangan01 {
    public static void main(String[] args) {
        // ==========================================
        // 1. KODE ASLI PERCOBAAN 
        // ==========================================
        System.out.println("=== KODE ASLI PERCOBAAN ===");

        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

            System.out.println(Arrays.toString(bil)); 

        // ==========================================
        // 2. KODE MODIFIKASI 
        // ==========================================
        System.out.println("\n=== KODE MODIFIKASI (Inisialisasi Sekaligus) ===");

        int[] bilModifikasi = {5, 13, -7, 17};

        for (int i = 0; i < bilModifikasi.length; i++) {
            System.out.println("bil[" + i + "] = " + bilModifikasi[i]);
        }

             System.out.println(Arrays.toString(bil)); 

    }
}