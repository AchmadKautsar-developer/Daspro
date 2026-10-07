public class OperatorIncrementdanDecrement {
    public static void main(String[] args) {

        int i = 1;

        // Increment
        System.out.println("Nilai i sebelum increment: " + i);
        System.out.println("Nilai i setelah increment: " + ++i);
        System.out.println("Nilai i setelah increment: " + i++);
        // Decrement
        System.out.println("Nilai i sebelum decrement: " + i);
        System.out.println("Nilai i setelah decrement: " + --i);
        System.out.println("Nilai i setelah decrement: " + i--);
        
        int x = 5;
        int y = ++x;
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);

        int z = 5;
        int w = z++;
        System.out.println("Nilai z: " + z);
        System.out.println("Nilai w: " + w);


    }
}
