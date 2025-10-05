package isc;

import java.util.Scanner;

public class day28 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan nilai siswa =");
        int nilai = a.nextInt();

        if (nilai == 100) {
            System.out.println(" nilai sempurna");
        } else if (nilai != 100) {
            System.out.println(" nilai belum sempurna");
        } 

    }
}
