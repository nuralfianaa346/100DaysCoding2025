package isc;

import java.util.Scanner;

public class Day85 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("masukkan elemen: ");
        int n = a.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }

        int maks = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maks) {
                maks = arr[i];
            }
        }
        System.out.println("angka maks: " + maks);
    }
}
