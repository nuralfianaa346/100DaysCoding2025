package D0255318;

import java.util.Scanner;

public class day17 {

    public static void main(String[] args) {
        Scanner ISC = new Scanner(System.in);
        System.out.print(" masukkan angka :");
        int a = ISC.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(" habis di bagi tiga dan lima");

        } else if (a % 5 == 0) {
            System.out.println(" habis di bagi lima");

        } else if (a % 3 == 0) {
            System.out.println(" habis di bagi tiga");
        } else {
            System.out.println(" selesai");
        }

    }

}
