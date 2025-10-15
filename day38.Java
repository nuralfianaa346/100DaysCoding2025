package isc;

import java.util.Scanner;

public class Day38Ngoding {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka :");
        int angka = a.nextInt();
        if (angka < 0) {
            System.out.println("angka tersebut negatif");
        } else if (angka > 0) {
            System.out.println("angka terebut positif");
        } else {
            System.out.println("angka tersebut nol");
        }

    }
}
