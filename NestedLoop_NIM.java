import java.util.Scanner;

public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            int totalSuhu = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
                totalSuhu += temps[i][j];
            }
            double rataRata = (double) totalSuhu / temps[0].length;
            System.out.println("Rata-rata suhu kota ke-" + i + ": " + rataRata);
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
