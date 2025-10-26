package isc;

import java.util.Scanner;

public class day49 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = a.nextInt();

        String hasil = (nilai >= 75) ? "lulus" : "tidak lulus";
        System.out.println("status: " + hasil);

    }

}
