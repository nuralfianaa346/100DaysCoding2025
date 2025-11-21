package isc;

import java.util.Scanner;


public class day75 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("masukkan teks: ");
        String teks = a.nextLine();
        
        System.out.println("====HASIL====");
        System.out.println("lenght: " + teks.length());
        System.out.println("lowerCase: " + teks.toLowerCase());
        System.out.println("upperCase: " + teks.toUpperCase());
    }
    
}
