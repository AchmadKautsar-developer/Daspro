public class JumlahKuadrat {
    public static void main(String[] args) {
        int nMax = 5;

        for (int n = 1; n <= nMax; n++) {
            int total = 0;
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            for (int i = 1; i <= n; i++) {
                int kuadrat = 0;

                for (int j = 1; j <= i; j++) {
                    kuadrat += i;
                }

                total += kuadrat;

                if (i == 1) {
                    System.out.print(kuadrat);
                } else {
                    System.out.print(" + " + kuadrat);
                }
            }

            System.out.println(" = " + total);
        }
    }
}
