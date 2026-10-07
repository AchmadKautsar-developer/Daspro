import java.util.Scanner;

public class StudiKasus01_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        panjang = input.nextInt();
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        System.out.println(keliling);
    input.close();
    }
}