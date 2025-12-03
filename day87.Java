package isc;

import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        
        int[] arr = {23, 4, 6, 11, 5, 26, 77};
        System.out.print("masukkan angkanya:  ");
        int n = a.nextInt();
        
        boolean cari = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                cari = true;
                System.out.println( "nahh adaa di indeks: " + i);
                break;
            }
   
        }
        if (!cari) {
            System.out.println("yahhh tidak ada");
        }
    }
}
