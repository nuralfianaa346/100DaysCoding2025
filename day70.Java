package isc;

import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan jumlah baris : ");
        int baris = a.nextInt();
        System.out.print("masukkan jumlah kolom:  ");
        int kolom = a.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
