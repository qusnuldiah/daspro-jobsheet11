import java.util.Scanner;
public class Individu2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N: ");
    int N = sc.nextInt();
    
    if (N < 5) {
      System.out.println("Nilai tidak valid!");
    }
    for (int i = N; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          System.out.print("*");
        }
      System.out.println();
    }
    sc.close();
  }
}
