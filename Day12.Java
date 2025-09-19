package D0255318;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner bio = new Scanner (System.in);
        System.out.println("\t>> SILAHKAN ISI DATA DIRI ANDA <<\n");
      String nama, alamat, status;
      nama = bio.nextLine();
      alamat = bio.nextLine();
      status = bio.nextLine();
      
      int tanggal, bulan,tahun;
      tanggal = bio.nextInt();
      bulan = bio.nextInt();
      tahun = bio.nextInt();
      
      short umur = bio.nextShort();
      
      double BB, tb;
      BB = bio.nextDouble();
      tb = bio.nextDouble ();
      
      char UkuranBaju;
      UkuranBaju = bio.next().charAt(0);
      
        System.out.println("NAMA :" + nama);
        System.out.println("ALAMAt :"+ alamat);
        System.out.println("STATUS:"+ status);
        System.out.println("TANGGAL LAHIR:"+ tanggal + bulan + tahun);
        System.out.println("UMUR:"+ umur);
        System.out.println("BERAT BADAN:"+ BB);
        System.out.println("TINGGI BADAN:"+ tb);
        System.out.println("UKURAN BAJU:"+UkuranBaju);

        
    
    }
}

