package day1;

import java.util.Scanner;

public class iloveddp {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" masukkan suhu");
        int suhu = a.nextInt();
        if (suhu <= 15) {
            System.out.println(" dingin");
        } else if (suhu > 15 && suhu < 25) {
            System.out.println(" hangat");
        } else if (suhu >= 25) {
            System.out.println(" panas");
        }

    }

}
