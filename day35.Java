package isc;

import java.util.Scanner;

public class day35 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan tahun :");
        int tahun = a.nextInt();
        if (tahun % 4 == 0) {
            System.out.println("tahun " + tahun + " adalah tahun kabisat");
        } else {
            System.out.println("tahun " + tahun + " bukan tahun kabisat");
        }

    }
}
