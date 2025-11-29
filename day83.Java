package isc;

import java.util.Scanner;

public class day83 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan jumlah angka: ");
        int jumlah = a.nextInt();

        int[] angka = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("masukkan angka: ");
            angka[i] = a.nextInt();

            total += angka[i];

        }
        System.out.println("hasil: " + total);
    }
}
