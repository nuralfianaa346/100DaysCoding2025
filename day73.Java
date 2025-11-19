
package isc;

import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int angka;
        int total = 0;
        
        while (true){
            System.out.print("masukkan angka: ");
            angka = a.nextInt();
            if (angka < 0) {
                break;
            }
            total += angka;
        }
        System.out.println("total penjumlahan =" + total);
    }
 
}
