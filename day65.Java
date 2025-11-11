package isc;

import java.util.Scanner;


public class day65 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int angka = a.nextInt();
        int faktorial = 1;
               for (int i = 1; i <= angka; i++) {
            faktorial *=i;
        }
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
    }
 
}
