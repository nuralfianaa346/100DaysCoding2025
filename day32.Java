package isc;

import java.util.Scanner;

public class day32 {

    public static void main(String[] args) {
        Scanner pia = new Scanner(System.in);
        System.out.println(" apakah kondisi saat ini sedang hujan? ( true / false)");
        boolean hujan = pia.nextBoolean();
        System.out.println(" apakah kondisi saat ini cerah?( true / false)");
        boolean mendung = pia.nextBoolean();

        boolean bawa_payung = hujan || mendung;

        
        if (bawa_payung) {
            System.out.println(" bawalah payung agar anda tidak kehujanan ");
        } else {
            System.out.println(" cuaca cerah, tidak usah membawa payung");
        }

    }
}
