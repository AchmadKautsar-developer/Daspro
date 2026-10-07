import java.util.Locale;

public class Tugas02_01 {
    public static void main(String[] args) {
        // --- INPUT ---
        double panjangTanah = 100.0;
        double lebarTanah = 30.0;
        double diameterKolam = 5.0;
        double sisiTaman = 2.0;

        // --- PROSES ---
        double luasTanah = panjangTanah * lebarTanah;
        
        double jariJari = diameterKolam / 2.0;
        double luasKolam = Math.PI * Math.pow(jariJari, 2);
        
        double luasTaman = Math.pow(sisiTaman, 2);
        
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        // --- OUTPUT ---
        Locale localeID = Locale.of("id", "ID");
        
        System.out.println("====== PERHITUNGAN LUAS TANAH PAK TONO ======");
        System.out.printf(localeID, "Luas Tanah Total        : %,.2f m²%n", luasTanah);
        System.out.printf(localeID, "Luas Kolam Ikan (r=2.5) : %,.2f m²%n", luasKolam);
        System.out.printf(localeID, "Luas Taman Bunga (2x2)  : %,.2f m²%n", luasTaman);
        System.out.println("----------------------------------------------");
        System.out.printf(localeID, "Luas Tanah Tidak Terpakai: %,.2f m²%n", luasSisa);
        System.out.println("==============================================");

        //  panjangTanah = 100.0
        //  lebarTanah = 30.0
        //  diameterKolam = 5.0
        //  sisiTaman = 2.0
        //  luasTanah = 100.0 * 30.0 = 3000.0
        //  jariJari = 5.0 / 2.0 = 2.5
        //  luasKolam = π * (2.5)^2 ≈ 19
        //  luasTaman = (2.0)^2 = 4.0
        //  luasSisa = 3000.0 - (19.634954084936208 + 4.0) ≈ 2976.3650459150638
        
    }
}
