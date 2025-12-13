package isc;

import java.util.Scanner;

public class day98 {

    public static void tampilFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci dari 1 sampai " + n + ":");
        tampilFibonacci(n);
    }
}
