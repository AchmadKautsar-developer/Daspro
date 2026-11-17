public class LatihanArray2 {
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("Tampilan secara terbalik:");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}