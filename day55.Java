package isc;

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("nilai : ");
        int nilai = a.nextInt();
        if (nilai >70) {
            System.out.println("Ujian Kroco Ji Pale");
        }else {
            System.out.println("Sa Jappo’ka Aih");
        }
    }
}
