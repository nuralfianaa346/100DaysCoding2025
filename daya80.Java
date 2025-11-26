package isc;

public class day80 {

    public static void main(String[] args) {
        int[] angka = {23, 4, 26, 98, 90};

        String[] nama = {"BELAJAR","JAVA", "SANGAT", "SERU"};

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");

        }
        System.out.println();

        for (String name : nama) {
            System.out.print(name + " ");
        }

    }
}
