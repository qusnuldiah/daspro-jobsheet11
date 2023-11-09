import java.util.Random;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                succes = (answer==number);

                if (answer < number) {
                    System.out.println("Angka yang Anda tebak terlalu kecil.");
                } else if (answer > number) {
                    System.out.println("Angka yang Anda tebak terlalu besar.");
                }
            }while(!succes);
            System.out.print("Apakah anda ingin mengulangan permainan (y/n)?");
            menu = input.nextLine().charAt(0);
        }while (menu == 'y' || menu=='Y');
    input.close();
    }
}
