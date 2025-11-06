package isc;

import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Masukkan angka: "); 
        int angka = a.nextInt();
        System.out.println("angka ganjil");
        for (int i = 1; i <= angka; i++) {
            if (i %2 != 0) {
                System.out.println("angka " + i + " ganjil");
            }
        }
        System.out.println();
        System.out.println("angka genap");
        for (int i = 1; i <=angka; i++) {
            if (i %2 ==0) {
                System.out.println("angka " + i + " genap");
            }
        }
    }
}
