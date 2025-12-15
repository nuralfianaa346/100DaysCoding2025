package isc;

import java.util.Scanner;

public class day99 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka N: ");
        int angka = a.nextInt();
        System.out.print("Bilangan prima dari 1 sampai " + angka + " : ");

        for (int i = 2; i <= angka; i++) {
            int pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }

            }
            if (pembagi == 2) {
                System.out.print(i + " ");

            }
        }

    }
}
