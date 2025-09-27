package D0255318;

public class day20 {

    public static void main(String[] args) {
        System.out.println("TIPE DATA PRIMITIF MENJADI STRING");
        int angka = 123;
        String a1 = String.valueOf(angka);
        String a2 = Integer.toString(angka);
        String a3 = "" + angka;
        System.out.println(" int (123) a1=" + a1 + "a2=" + a2 + "a3 =" + a3);

        byte ina = 23;
        String b1 = String.valueOf(ina);
        String b2 = Byte.toString(ina);
        String b3 = "" + ina;
        System.out.println(" byte (23) b1 =" + b1 + "b2" + b2 + "b3" + b3);

        short pia = 254;
        String c1 = String.valueOf(pia);
        String c2 = Short.toString(pia);
        String c3 = "" + pia;
        System.out.println("short (254) c1 =" + c1 + "c2 =" + c2 + "c3 =" + c3);

        long fia = 46;
        String d1 = String.valueOf(fia);
        String d2 = Long.toString(fia);
        String d3 = "" + fia;
        System.out.println("long (46) d1 =" + d1 + "d2 =" + d2 + "d3 =" + d3);

        double AL = 26.4;
        String e1 = String.valueOf(AL);
        String e2 = Double.toString(AL);
        String e3 = "" + AL;
        System.out.println("double (26.4) e1 =" + e1 + "e2 =" + e2 + "e3 =" + e3);

        float aa = 23.4f;
        String f1 = String.valueOf(aa);
        String f2 = Float.toString(aa);
        String f3 = "" + aa;
        System.out.println("float (23.4f) f1 =" + f1 + "f2 =" + f2 + "f3 =" + f3);

        char bb = 'P';
        String g1 = String.valueOf(bb);
        String g2 = Character.toString(bb);
        String g3 = "" + bb;
        System.out.println("char (p) g1 =" + g1 + "g2 =" + g2 + "g3 =" + g3);

        boolean benar = true;
        String h1 = String.valueOf(benar);
        String h2 = Boolean.toString(benar);
        String h3 = "" + benar;
        System.out.println("boolean (true) h1 =" + h1 + "h2 =" + h2 + "h3 =" + h3);
        System.out.println("\t SELESAI!!");

    }

}
