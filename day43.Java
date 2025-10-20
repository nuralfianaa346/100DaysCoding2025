package isc;

import java.util.Scanner;

public class day43 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = a.nextInt();
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5");
        } else {
            System.out.println("bukan kelipatan 3,5, ataupun 3 dan 5");
        }

    }
}
