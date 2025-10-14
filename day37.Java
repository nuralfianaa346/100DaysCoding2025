package isc;

import java.util.Scanner;

public class day37 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("MASUKKAN BERAPA ANGKA YANG INGIN DICEK:");
        int jumlah = a.nextInt();

        int ganjil = 0;
        int genap = 0;

        String B_genap = "";
        String B_ganjil = "";

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("masukkan bilangan ke " + i + ": ");
            int angka = a.nextInt();
            if (angka % 2 == 0) {
                genap++;
                if (B_genap.equalsIgnoreCase("")) {
                    B_genap += angka;
                } else {
                    B_genap += ", " + angka;
                }
            } else {
                ganjil++;
                if (B_ganjil.equalsIgnoreCase("")) {
                    B_ganjil += angka;

                } else {
                    B_ganjil += ", " + angka;
                }

            }

        }
        System.out.println("bilangan genap :" + genap+ "(" + B_genap + ")");
        System.out.println("bilangan ganjil :" + ganjil + "(" + B_ganjil+ ")");

    }
}
