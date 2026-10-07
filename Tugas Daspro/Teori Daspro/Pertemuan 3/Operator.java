public class Operator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        a &= b; // a = a & b   

        System.out.println("Hasil a &= b: " + a);
        System.out.println("Hasil a | b: " + (a | b));
        System.out.println("Hasil a ^ b: " + (a ^ b));
        System.out.println("Hasil ~a: " + (~a));
        System.out.println("Hasil a << 2: " + (a << 2));
        System.out.println("Hasil a >> 2: " + (a >> 2));
        System.out.println("Hasil a >>> 2: " + (a >>> 2));
        System.out.println("Hasil a + b: " + (a + b));
        System.out.println("Hasil a - b: " + (a - b));
        System.out.println("Hasil a * b: " + (a * b));
        System.out.println("Hasil a / b: " + (a / b));
        System.out.println("Hasil a % b: " + (a % b));


    }

}
