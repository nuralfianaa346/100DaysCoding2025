package isc;

import java.util.Scanner;

public class day94 {

    static void CetakBiodata() {
        Scanner a = new Scanner(System.in);

        System.out.print("masukkan nama anda: ");
        String nama = a.nextLine();
        System.out.print("masukkan NIM: ");
        String nim = a.nextLine();
        System.out.print("masukkan kelas: ");
        String kelas = a.nextLine();
        System.out.print("masukkan jurusan: ");
        String jurusan = a.nextLine();

        System.out.println();
        System.out.println("====BIODATA MAHASISWA====");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Jurusan : " + jurusan);

    }

    public static void main(String[] args) {
        CetakBiodata();
    }
}
