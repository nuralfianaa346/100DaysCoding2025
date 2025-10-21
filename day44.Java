package isc;

import java.util.Scanner;

public class day44 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan nilai anda : ");
        int nilai = a.nextInt();

        String predikat = "";

        if (nilai >= 85) {
            predikat = "A";
        } else if (nilai >= 75) {
            predikat = "B";
        } else if (nilai >= 65) {
            predikat = "C";
        } else if (nilai >= 50) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        System.out.println("NILAI: " + nilai);
        System.out.println("PREDIKAT: " + predikat);

    }
}
