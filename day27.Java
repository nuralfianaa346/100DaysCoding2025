package isc;

import java.util.Scanner;

public class day27 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int p = isc.nextInt();
        int l = isc.nextInt();

        int keramik = 4;
        int jumlah = p * l / keramik; 
        
        System.out.println(jumlah);
        
        
    }
}
