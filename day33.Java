package isc;

import java.util.Scanner;

public class day33 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan usia anda =");
        int usia = a.nextInt();
        int batas_usia = 17;
        if (!(usia >= batas_usia)) {
            System.out.println("mohon maaf usia anda belum memenuhi syarat");
        } else {
            System.out.println("silahkan masuk bioskop");
        }

    }

}
