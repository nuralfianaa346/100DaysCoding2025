package isc;

import java.util.Scanner;

public class day84 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int angka = a.nextInt();
        int tamp = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2 != 0) {
                tamp += i;
            }
        }
        System.out.println(tamp);
    }
}
