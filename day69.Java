package isc;

import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = a.nextInt();

        for (int i = 1; i <= angka; i++) {

            if (i % 5 == 0) {

                if (i % 2 == 0) {
                    System.out.println(i + " : angka genap, kelipatan 5");
                } else {
                    System.out.println(i + " : angka ganjil, kelipatan 5");
                }

            } else {

                if (i % 2 == 0) {
                    System.out.println(i + " : angka genap");
                } else {
                    System.out.println(i + " : angka ganjil");
                }
            }
        }

    }
}
