package isc;

import java.util.Scanner;

public class day56 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int angka;
        do {
            System.out.print("masukkan angka: ");
            angka = a.nextInt();
            System.out.println("anda memasukkan angka : " + angka);
            System.out.println();
        } while (angka != 0);
        System.out.println("pemrograman selesai");
    }
}
