package day24;

import java.util.Scanner;

public class isc {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" LUAS LINGKARAN ");
        System.out.println(" masukkan jari - jari lingkaran :");
        double JariJari = a.nextDouble();

        double luas = Math.PI * JariJari * JariJari;

        System.out.println(" luas lingkaran :" + luas);

    }
}
