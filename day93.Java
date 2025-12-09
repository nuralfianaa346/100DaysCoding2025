package isc;


public class day93 {
   static void hitungPembulatan(double angka) {
        System.out.println("Angka : " + angka);
        System.out.println("ceil  = " + Math.ceil(angka));
        System.out.println("floor = " + Math.floor(angka));
        System.out.println("round = " + Math.round(angka));
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        hitungPembulatan(4.3);
        hitungPembulatan(4.8);
        hitungPembulatan(-3.4);

    }
}
