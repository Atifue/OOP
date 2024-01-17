import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter odd integer: ");
        int n = input.nextInt();      
        if(n % 2 == 0){
            System.exit(0);
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("+");
                } 
                else if (j == n - i - 1) {
                    System.out.print("x");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = 0; j < n / 2; j++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = n / 2 + 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("+");
                } 
                else if (j == n - i - 1) {
                    System.out.print("x");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
