public class nurAlfiana {
    public static void main(String[] args) {
        
        System.out.printf("\t>>> TIPE DATA BOOLEAN DAN CHAR<<<\n");
        int nilai = 78;
        int kkm = 80;

        
        boolean lulus;
        char status;

        
        if (nilai >= kkm) {
            lulus = true;
            status = 'L'; // lulus//
        } else {
            lulus = false;
            status = 'T';  // tidak lulus//
        }

        
        System.out.println("Nilai: " + nilai);
        System.out.println("Lulus? " + lulus);
        System.out.println("Status: " + status);
        System.out.println("\n TERIMA KASIH!!");
    }
}
