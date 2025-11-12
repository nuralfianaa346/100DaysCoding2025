package isc;

import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
         System.out.print("masukkan angka: ");
        int angka = a.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print("A"+" ");
            }
            System.out.print("\n");
        }
    }
 
}
