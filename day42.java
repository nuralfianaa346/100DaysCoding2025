package isc;

import java.util.Scanner;

public class day41 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double gajipokok;
        double potongan = 0;
        double gajibersih;
        System.out.println("masukkan gaji pokok :");
        gajipokok = a.nextDouble();

        if (gajipokok <= 3000000) {
            potongan = 0.05;
        } else if (gajipokok <= 5000000) {
            potongan = 0.10;
        } else {
            potongan = 0.15;
        }

        gajibersih = gajipokok - (gajipokok * potongan);

        System.out.println("Potongan: " + (potongan * 100) + "%");
        System.out.println("Gaji Bersih: Rp" + gajibersih);

    }
}
