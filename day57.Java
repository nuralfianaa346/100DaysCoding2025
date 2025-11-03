package isc;

import java.util.Scanner;

public class day57 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = a.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
           System.out.println();
        }
    }
}
