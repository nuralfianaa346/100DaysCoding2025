package isc;

import java.util.Scanner;

public class day86 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan elemen: ");
        int e = a.nextInt();

        int[] arr = new int[e];

        for (int i = 0; i < e; i++) {
            arr[i] = a.nextInt();

        }
        int min = arr[0];

        for (int i = 0; i < e; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("angka minimal:" + min);
    }
}
