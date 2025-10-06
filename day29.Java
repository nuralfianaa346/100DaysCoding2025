package nurAlfiana;

import java.util.Scanner;

public class day29 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("menetukan siswa yang lulus ");
        System.out.println(" masukkan nama siswa =");
        String nama = a.nextLine();
        System.out.println(" masukkan nilai siswa = ");
        int nilai = a.nextInt();

        if (nilai > 75) {
            System.out.println(" selamat " + nama + " anda dinyatakan lulus");
        } else if (nilai < 75) {
            System.out.println(" maaf, " + nama + " anda tidak lulus");
        }

    }
}
