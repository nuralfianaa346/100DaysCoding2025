package isc;

import java.util.Scanner;

public class day97 {

    public static int persegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan sisi: ");
        int sisi = a.nextInt();

        int total = persegi(sisi);

    }
}
