import java.util.Scanner;

public class MenghitungLuasPersegiPanjang01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int panjang = 10;
        int lebar = 5;
        int luas = panjang * lebar;

        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);

        panjang = sc .nextInt();
        lebar = sc .nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi adalah: " + luas);

        sc.close();
    }
}
