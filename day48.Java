package isc;

import java.util.Scanner;

public class day48 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka1 = a.nextInt();
        System.out.print("masukkan operator: ");
        char cr = a.next().charAt(0);
        System.out.print("masukkan angka: ");
        int angka2 = a.nextInt();

        switch (cr) {
            case '+':
                angka1 += angka2;
                System.out.println("hasil: " + angka1);
                break;
            case '-':
                angka1 -= angka2;
                System.out.println("hasil: " + angka1);
                break;
            case '*':
                angka1 *= angka2;
                System.out.println("hasil: " + angka1);
                break;
            case '/':
                if (angka2 != 0) {
                    angka1 /= angka2;
                    System.out.println("hasil: " + angka1);
                } else {
                    System.out.println("eror");
                }
                break;
        }

    }
}
