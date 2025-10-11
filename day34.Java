package isc;

import java.util.Scanner;

public class day34 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan nilai tugas :");
        int t = a.nextInt();
        System.out.println("masukkan nilai UTS :");
        int uts = a.nextInt();
        System.out.println("masukkan nilai UAS :");
        int uas = a.nextInt();

        int rata_rata = (t + uts + uas) / 3;
        int JumlahLulus = 0;
        int JumlahTidakLulus = 0;

        if (rata_rata >= 75 && uas >= 80) {
            System.out.println(" RATA RATA :" + rata_rata);
            System.out.println(" SELAMAT ANDA DINYATAKAN LULUS ");
            JumlahLulus++;
        } else {
            System.out.println(" RATA RATA :" + rata_rata);
            System.out.println(" MAAF ANDA TIDAK LULUS ");
            JumlahTidakLulus++;
        }
        System.out.println(" JUMLAH MAHASISWA YANG LULUS :" + JumlahLulus);
        System.out.println(" JUMLAH MAHASISWA YANG TIDAL LULUS :" + JumlahTidakLulus);
    }
}
