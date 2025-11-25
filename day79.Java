package isc;

import java.util.Scanner;

public class Day89 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String username, password;
        String loginUser, loginPass;

        System.out.println("===BUAT AKUN===");
        System.out.print("Buat user name: ");
        username = a.nextLine();

        System.out.print("buat password: ");
        password = a.nextLine();

        System.out.println("\nakun berhasil dibuat\n ");

        System.out.println("===LOGIN AKUN===");
        while (true) {
            System.out.print("Masukkan username: ");
            loginUser = a.nextLine();
            System.out.print("Masukkan password: ");
            loginPass = a.nextLine();

            if (loginUser.equals(username) && loginPass.equals(password)) {
                System.out.println("\nLogin berhasil! SELAMAT DATANG, " + username);

                break;

            } else {
                System.out.println("Login gagal!! Silahkan coba lagi");
            }
        }
    }
}
