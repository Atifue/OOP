import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter odd integer: ");
        int n = input.nextInt();

        if(n % 2 == 0){
            System.exit(0);
        }

        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("+");
        }

        for(int i = 0; i < n/2; i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i = n/2 + 2; i <= n; i++){
            for(int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }
            System.out.println("x");
        }
    }
}
