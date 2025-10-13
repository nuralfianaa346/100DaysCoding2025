package isc;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan jenis kendaraan anda ( motor / mobil ):");
        String kendaraan = a.nextLine();
        System.out.println("Masukkan lama parkir anda ( jam ):");
        int jam = a.nextInt();
        int jam_tambahan = 0;

        if (kendaraan.equalsIgnoreCase("mobil")) {
            if (jam <= 2) {
                int total = 5000;
                System.out.println("TOTAL PEMBAYARAN :" + "RP." + total);
            } else {
                jam_tambahan = jam - 2;
                int total = 5000 + (jam_tambahan * 2000);
                System.out.println("TOTAL PEMBAYARAN :" + "RP." + total);
            }
        } else if (kendaraan.equalsIgnoreCase("motor")) {
            if (jam <= 2) {
                int total = 2000;
                System.out.println("TOTAL PEMBAYARAN :" + "RP." + total);
            } else {
                jam_tambahan = jam - 2;
                int total = 2000 + (jam_tambahan * 1000);
                System.out.println("TOTAL PEMBAYARAN :" + "RP" + total);
            }
        }else{
            System.out.println("jenis kendaraan tidak dikenali");
        }

    }
}
