public class day6 {

    public static void main(String[] args) {
        System.out.printf("\n>>> RATA - RATA TIMBANGAN GABAH MAMA AJI<<<\n");
        
        int karung1 = 140;
        double karung2 = 145.2;
        float karung3 = 140.5f;
        int karung4 = 148;
        double karung5 = 148.4;
        float jumlahKarung = 5.0f;
        
        System.out.println(" karung1 :" + karung1 );
        System.out.println(" karung2 :" + karung2 );
        System.out.println(" karung3 :" + karung3 );
        System.out.println(" karung4 :" + karung4 );
        System.out.println(" karung5 :" + karung5 );
        
        double total = ( karung1 + karung2 + karung3 + karung4 + karung5 )/ 5.0;
        
        System.out.println("total :" + total );
        System.out.printf(" >>TERIMA KASIH!<<\n");
        
        
        
    }
}
