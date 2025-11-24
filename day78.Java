package isc;

import java.util.Scanner;

public class day78 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan teks: ");
        String teks = a.nextLine();

        System.out.println("Panjang teks (length): " + teks.length());
        System.out.println("Huruf besar (toUpperCase): " + teks.toUpperCase());
        System.out.println("Huruf kecil (toLowerCase): " + teks.toLowerCase());
    }

}
