package isc;

import java.util.Scanner;

public class day47 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("masukkan angka ( 1 - 7 ): ");
        int angka = a.nextInt();

        switch (angka) {
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            case 8:
                System.out.println("hanya ada tujuh hari");
                break;
        }

    }
}
