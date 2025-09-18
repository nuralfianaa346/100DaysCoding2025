package D0255318;

import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner pia = new Scanner (System.in);
        System.out.print(" masukkan lebar :");
        // lebar = 5 //
        int lebar = pia.nextInt();
        System.out.print(" masukkan panjang :");
        // panjang = 7//
        int panjang = pia.nextInt();
        int hasil = panjang * lebar;
        System.out.println(" hasil :" + hasil);
            
    }
}
