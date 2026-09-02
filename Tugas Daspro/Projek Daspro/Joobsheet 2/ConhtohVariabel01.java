public class ConhtohVariabel01 {
    public static void main(String[] args) {

        String hobby = "Gym";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double ipk = 4.00, tinngi = 1.63;

        System.out.println(hobby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinngi));

    }
}
