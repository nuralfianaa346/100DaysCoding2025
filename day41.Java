package pertemuan.mentor;

import java.util.Scanner;

public class mentorSoal2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double panjang = a.nextDouble();
        double lebar = a.nextDouble();

        double luas = panjang * lebar;

        System.out.println("luas taman yang akan ditanami rumput adalah " + luas + " meter persegi");

    }
}
