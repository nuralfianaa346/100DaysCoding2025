package isc;


public class day77 {
    public static void main(String[] args) {
        String teks = "   Belajar Pemrograman Java   ";
        System.out.println("Teks asli: '" + teks + "'");

        // trim()
        String trimTeks = teks.trim();
        System.out.println("Setelah trim: '" + trimTeks + "'");

        // substring()
        String ambilKata = trimTeks.substring(8, 20); 
        System.out.println("Substring(8,20): '" + ambilKata + "'");

        // replace()
        String gantiKata = trimTeks.replace("Java", "Python");
        System.out.println("Setelah replace: '" + gantiKata + "'");
    }
}
