package D0255318;

import java.util.Scanner;

public class day23 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.println(">>LUAS PERSEGI PANJANG<<");
        System.out.println(" masukkan lebar :");
        int Lebar = isc.nextInt();
        System.out.println(" masukkan panjang :");
        int Panjang = isc.nextInt();
        int luas = Lebar * Panjang;
        System.out.println("luas persegi panjang :" + luas);

    }
}
