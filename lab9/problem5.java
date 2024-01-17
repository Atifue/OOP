import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter from 5 to 25: ");
        int in = input.nextInt();

        while (in < 5 || in > 25 || in % 2 == 0) {
            System.out.println("Invalid!");
            System.out.print("Enter from 5 to 25: ");
            in = input.nextInt();
        }

        
        for (int i = 1; i <= in; i+=2) { // output row
            for (int j = 1; j <= in; j += 2) { // odd numbers from 1 to user input
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}

