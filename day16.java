package D0255318;
public class day16 {
public static void main(String[] args) {
        System.out.println(" \t>>HASIL PENJUALAN BUAH<< ");
        int ApelPerKotak = 5;
        int kotakTerjual = 12;
        int hargaPerApel = 2000;

        int totalTerjual = ApelPerKotak * kotakTerjual;
        int TotalPendapatan = totalTerjual * hargaPerApel;
        //menghitung rata rata//
        int pendapatanPerKotak = TotalPendapatan / hargaPerApel;

        System.out.println("TOTAL APEL YANG TERJUAL =" + totalTerjual);
        System.out.println("TOTAL PENDAPATAN HARI INI =" + TotalPendapatan);
        System.out.println("RATA RATA PENDAPATAN =" + pendapatanPerKotak);

    }
}
