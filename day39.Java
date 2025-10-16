package isc;

import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("=== MENU KASIR ===");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng  - Rp12.000");
        System.out.println("3. Ayam Bakar  - Rp18.000");
        System.out.println("4. Mie Pangsit - Rp10.000");
        System.out.print("pilihlah menu yang anda inginkan (1-3) :");
        int pilihan = a.nextInt();
        if (pilihan == 1) {
            System.out.println("anda memilih NASI GORENG");
            System.out.println("harga : Rp15.000");
        } else if (pilihan == 2) {
            System.out.println("anda memilih MIE GORENG");
            System.out.println("harga : Rp12.000");
        } else if (pilihan == 3) {
            System.out.println("anda memilih AYAM BAKAR");
            System.out.println("harga : Rp18.000");
        } else if (pilihan == 4) {
            System.out.println("anda memilih MIE PANGSIT");
            System.out.println("harga : Rp10.000");
        }

    }

}
