package isc;

import java.util.Scanner;

public class day46 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("===PILIH MENU===");
        System.out.println("1. hitung luas persegi");
        System.out.println("2. hitung luas lingkaran");
        System.out.println("3. hitung luas persegi panjang");
        System.out.println("4. tampilkan data mahasiswa");
        System.out.println("5. keluar");

        System.out.print("masukkan angka (1 - 5): ");
        int angka = a.nextInt();

        switch (angka) {
            case 1:
                System.out.print("masukkan sisi : ");
                double sisi = a.nextDouble();
                double persegi = sisi * sisi;
                System.out.println("luas persegi : " + persegi + " cm");
                break;
            case 2:
                System.out.print("masukkan jari jari lingkaran : ");
                double jari = a.nextDouble();
                double lingkaran = Math.PI * jari * jari;
                System.out.println("luas lingkaran : " + lingkaran);
                break;
            case 3:
                System.out.print("masukkan panjang : ");
                double panjang = a.nextDouble();
                System.out.print("masukkan lebar : ");
                double lebar = a.nextDouble();

                double lp = panjang * lebar;
                System.out.println("luas persegi panjang : " + lp + " cm");
                break;
            case 4:
                System.out.println("NAMA : NUR ALFIANA");
                System.out.println("NIM : D0225318");
                System.out.println("PRODI : TEKNIK INFORMATIKA");
                break;
            case 5:
                System.out.println("TERIMA KASIH, PROGRAM SELESAI!!");

        }

    }
}
