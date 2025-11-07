 Scanner a = new Scanner (System.in);
        System.out.print("Masukkan nilai N: ");
        int N = a.nextInt();
        System.out.print("Masukkan nilai M: ");
        int M = a.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");

                for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
