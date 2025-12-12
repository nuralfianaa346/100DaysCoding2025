package isc;

import java.util.Scanner;

public class day96 {

    static int matematika(int a, int b) {
        int hasil = 0;
        hasil = a + b;
        System.out.println("hasil penjumlahan: " + hasil);
        hasil = a - b;
        System.out.println("hasil pengurangan: " + hasil);
        hasil = a * b;
        System.out.println("hasil perkalian: " + hasil);
        hasil = a / b;
        System.out.println("hasil pembagian: " + hasil);
        return hasil;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        int angka1 = a.nextInt();
        System.out.print("masukkan angka kedua: ");
        int angka2 = a.nextInt();

        int hasil = matematika(angka1, angka2);
    }
}
