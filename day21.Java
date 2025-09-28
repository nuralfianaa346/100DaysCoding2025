package D0255318;

public class day21 {

    public static void main(String[] args) {
        System.out.println("\t MENUKAR NILAI DUA VARIABLE\n");
        int a = 11;
        int b = 26;

        System.out.println(" \t SEBELUM PENUKARAN");
        System.out.println(" a =" + a);
        System.out.println(" b =" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\t SETELAH MELAKUKAN PENUKARAN");
        System.out.println("a =" + a);
        System.out.println("b =" + b);

    }

}
