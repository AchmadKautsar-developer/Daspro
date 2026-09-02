public class ContohTipeData01 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        char golonganDarah = 'A';
        byte jarak = (byte) 130; // Melakukan casting dari int (130) ke byte (overflow -> -126)
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50F; // Menggunakan akhiran F untuk mendefinisikan literal float
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10; // Heksadesimal 0x10 (setara 16 desimal)

        // Menampilkan hasil keluaran ke layar
        System.out.println("Golongan darah\t\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t\t\t\t: " + angkaDesimal);
    }
}