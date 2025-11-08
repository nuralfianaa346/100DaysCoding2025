package isc;

import java.util.Scanner;

public class day62 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka N: ");
        int n = a.nextInt();
        int tamp = 0;
        for (int i = 1; i <= n; i++) {
            tamp += i;

        }
        System.out.println("jumlah dari 1 sampai " + n + " adalah: " + tamp);
    }
}
