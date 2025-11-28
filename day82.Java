package isc;

import java.util.Scanner;

public class day82 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan jumlah nama: ");
        int j = a.nextInt();

        a.nextLine();

        String[] nama = new String[j];

        for (int i = 0; i < j; i++) {
            System.out.print("masukkan nama " + (i + 1) + ": ");
            nama[i] = a.nextLine();

        }
        System.out.println("========================");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("daftar nama: " + nama[i]);
        }
    }
}
