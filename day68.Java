package isc;

import java.util.Scanner;

public class day68 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan ukuran sisi: ");
        int n = a.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
