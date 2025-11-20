package isc;

import java.util.Scanner;

public class day74 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int pilihan;
        double a, b, hasil;
        do {
            System.out.println("=====MENU PILIHAN=====");
            System.out.println("1. PENJUMLAHAN");
            System.out.println("2. PENGURANGAN");
            System.out.println("3. PERKALIAN");
            System.out.println("4. PEMBAGIAN");
            System.out.println("5. KELUAR");
            System.out.print("pilih menu (1-5) : ");
            pilihan = isc.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("masukkan angka pertama: ");
                a = isc.nextDouble();
                System.out.print("masukkan angka kedua: ");
                b = isc.nextDouble();

                switch (pilihan) {
                    case 1:
                        hasil = a + b;
                        System.out.println("hasil penjumlahan: " + hasil);
                        break;

                    case 2:
                        hasil = a - b;
                        System.out.println("hasil pengurangan: " + hasil);
                        break;

                    case 3:
                        hasil = a * b;
                        System.out.println("hasil perkalian: " + hasil);
                        break;

                    case 4:
                        hasil = a / b;
                        System.out.println("hasil pembagian: " + hasil);
                        break;

                }
            } else if (pilihan == 5) {
                System.out.println("KELUAR DARI PROGRAM");
            }

        } while (pilihan != 5);

    }
}
