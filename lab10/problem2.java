import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two positive integers with a difference of at least 10: ");
        int x = input.nextInt();
        int y = input.nextInt();

        while(y - x < 10 || y < 0 || x < 0){
            System.out.print("Invalid input! Try again: ");
            x = input.nextInt();
            y= input.nextInt();
        }

        int r = (int) (Math.random() * y + x);

        System.out.println("Random integer between " + x + " and " + y + " is " + r + ".");
    }
}
