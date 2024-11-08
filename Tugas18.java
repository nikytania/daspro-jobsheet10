import java.util.Scanner;

public class Tugas18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvei = new int[10][6];
        int jumlahResponden = hasilSurvei.length;
        int jumlahPertanyaan = hasilSurvei[0].length;

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Masukkan jawaban untuk responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nNilai rata-rata untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRataResponden = (double) total / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nNilai rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRataPertanyaan = (double) total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nNilai rata-rata keseluruhan: " + rataRataKeseluruhan);

        sc.close();
    }
}
