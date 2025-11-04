package isc;

import java.util.Scanner;

public class day58 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = a.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = angka; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
