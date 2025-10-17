package isc;

import java.util.Scanner;

public class day40 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double angka1 = a.nextDouble();
        char op = a.next().charAt(0);
        double angka2 = a.nextDouble();

        if (op == '+') {
            angka1 += angka2;
            System.out.println("hasil :" + angka1);
        } else if (op == '-') {
            angka1 -= angka2;
            System.out.println("hasil :" + angka1);
        } else if (op == '*') {
            angka1 *= angka2;
            System.out.println("hasil :" + angka1);
        } else if (op == '/') {

            if (angka2 != 0) {
                angka1 /= angka2;
                System.out.println("hasil :" + angka1);
            } else {
                System.out.println("operator tidak valid");
            }
        }

    }

}
