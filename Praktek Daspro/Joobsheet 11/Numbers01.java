import java.util.Arrays;

public class Numbers01 {
    public static void main(String[] args) {

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5]; 
        myNumbers[1] = new int[3]; 
        myNumbers[2] = new int[1]; 

        System.out.println("--- Isi Jagged Array per Baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        System.out.println("\nHasil Arrays.toString(myNumbers):");
        System.out.println(Arrays.toString(myNumbers));

        System.out.println("\nHasil Arrays.deepToString(myNumbers):");
        System.out.println(Arrays.deepToString(myNumbers)); 
    }
}