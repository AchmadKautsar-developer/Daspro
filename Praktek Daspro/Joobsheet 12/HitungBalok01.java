import java.util.Scanner;

public class HitungBalok01 {
    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);
        System.out.println("Luas Permukaan Balok adalah " + hitungLuasPermukaanBalok(p, l, t));

        int[][] balok = {{4, 3, 5}, {6, 2, 4}, {5, 5, 5}};
        for (int i = 0; i < balok.length; i++) {
            int bp = balok[i][0], bl = balok[i][1], bt = balok[i][2];
            System.out.printf("Balok %d (%dx%dx%d) -> Volume: %d, Luas Permukaan: %d%n",
                    (i + 1), bp, bl, bt, hitungVolume(bt, bp, bl), hitungLuasPermukaanBalok(bp, bl, bt));
        }

        input.close();
    }
}