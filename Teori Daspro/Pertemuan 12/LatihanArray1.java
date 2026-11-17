public class LatihanArray1 {
    public static void main(String[] args) {
        int[] array30 = new int[30];

        for (int i = 0; i < array30.length; i++) {
            array30[i] = (i + 1) * 10; 
        }

        System.out.print("Isi array: ");
        for (int i = 0; i < array30.length; i++) {
            System.out.print(array30[i] + " ");
        }
    }
}