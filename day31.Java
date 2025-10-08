package isc;

import java.util.Scanner;

public class Day31Ngoding {

    public static void main(String[] args) {
        System.out.println("OPERATOR LOGIKA && (AND)");
        Scanner a = new Scanner(System.in);
        System.out.println("masukkan username :");
        String us = a.nextLine();
        String USER = "admin";
        System.out.println("masukkan sandi");
        String pw = a.nextLine();
        String SANDI = "12345";

        if (us.equalsIgnoreCase(USER) && pw.equalsIgnoreCase(SANDI)) {
            System.out.println("login berhasil ");
        } else {
            System.out.println("login gagal, silahkan coba lagi");
        }

    }
}
