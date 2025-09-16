package nuralfiana;
public class NurAlfiana {
    public static void main(String[] args) {
        System.out.println("\t >>ASSALAMUALAIKUM<<\n"); 
        System.out.println("DEKLARASI");
        byte umur;
        short Lb ;
        long NoHp;
        float tb;
        double bb;
        char Ub;
        int UkuranSepatu ;
        boolean JenisKelamin;
        
        System.out.println("INISIALISASI");
        umur = 18;
        Lb = 85 ;
        NoHp =62448093; 
        tb = 158.9f;
        bb = 55.5;
        Ub = 'L';
        UkuranSepatu = 38;
        JenisKelamin = true;
        
        System.out.println("==SEBELUM UPDATE==");
        System.out.println(" umur : "+ umur);
        System.out.println("Lb : "+ Lb);
        System.out.println("NoHp :"+ NoHp);
        System.out.println("tb :" + tb);
        System.out.println("bb :"+ bb);
        System.out.println("Ub :"+ Ub);
        System.out.println("UkuranSepatu :" + UkuranSepatu);
        System.out.println("JenisKelamin :" + JenisKelamin);
        
        System.out.println("==SETELAH UPDATE==");
        umur = 19;
        Lb = 87;
        NoHp = 73558004;
        tb = 159.0f;
        bb = 56.2;
        Ub = 'P';
        UkuranSepatu = 39;
        JenisKelamin = false;
        System.out.println("umur :" + umur);
        System.out.println("Lb :" + Lb);
        System.out.println("NoHp :" + NoHp);
        System.out.println("tb :" + tb);
        System.out.println("bb :" + bb);
        System.out.println("Ub :" + Ub);
        System.out.println("UkuranSepatu :" + UkuranSepatu);
        System.out.println("JenisKelamin :" + JenisKelamin);
        
    }
    
}
