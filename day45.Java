public class day45 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka (1 - 3 ): ");
        int angka = a.nextInt();

        switch (angka) {
            case 1:
                System.out.println("angka yang anda pilih adalah satu");
                break;
            case 2:
                System.out.println("angka yang anda pilih adalah dua");
                break;
            case 3:
                System.out.println("angka yang anda pilih adalah tiga");
                break;
        }

    }
}
