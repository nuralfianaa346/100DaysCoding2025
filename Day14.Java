package D0255318;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner pia = new Scanner (System.in);
        String p = pia.nextLine();
        int i = Integer.parseInt(p);
        byte a = Byte.parseByte(p);
        short n = Short.parseShort(p);
        long r = Long.parseLong(p);
        float v = Float.parseFloat(p);
        double m = Double.parseDouble(p);
        char l = p.charAt(0);
        String pi = "true";
        boolean w = Boolean.parseBoolean(pi);
        
        System.out.println(i);
        System.out.println(a);
        System.out.println(n);
        System.out.println(r);
        System.out.println(v);
        System.out.println(m);
        System.out.println(l);
        System.out.println(w);
     
    }
}
