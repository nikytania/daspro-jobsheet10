import java.util.Scanner;

public class BioskopWithScannernomor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println(" -------- MENU -------- ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1 :
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        if (baris >= 1 && baris <= 4) {
                            break;
                        } else
                            System.out.println("Baris tidak valid");
                    }
                        
                    while (true) {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        if (kolom >= 1 && kolom <= 2) {
                            break;
                        } else
                            System.out.println("Kolom tidak valid");
                    }
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi. Silahkan pilih kursi yang lain!");
                        } else
                        penonton[baris-1][kolom-1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                    
                } while (next.equalsIgnoreCase("y")) ;
                    break;

                case 2 :
                    System.out.println("-------------------");
                    System.out.println("Daftar Penonton");
                    System.out.println("-------------------");
                    for (int i = 0; i < penonton.length; i++) {
                        for(int j = 0; j < penonton[i].length; j++) {
                            System.out.println(penonton[i][j]);
                        }
                    }
                    break;

                case 3 :
                    System.out.println("Log out");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}